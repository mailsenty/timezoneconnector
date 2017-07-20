package org.mule.modules.timezone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.timezone.config.ConnectorConfig;

@Connector(name="time-zone", friendlyName="TimeZone")
public class TimeZoneConnector {

    @Config
    ConnectorConfig config;

    private final String USER_AGENT = "Mozilla/5.0";
   	private final String MASHAPE_KEY = "gSu3q2y5yymshH0OMkuExkKEOvFkp10qqQ4jsnK9a7OM0HzuPY";
   	String timezoneURL="https://tehuano-time-zone-v1.p.mashape.com/api2/timezone/";
      


   	@Processor
   	public String gettimezone(String latitude,String longitude) {
   		StringBuffer response = new StringBuffer();
   		String resp;
   		String url=timezoneURL+latitude+"/"+longitude;
   		try {
   			URL obj = new URL(url);
   			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

   			// optional default is GET
   			con.setRequestMethod("GET");

   			// add request header
   			con.setRequestProperty("User-Agent", USER_AGENT);
   			con.setRequestProperty("X-Mashape-Key",MASHAPE_KEY);
   			int responseCode = con.getResponseCode();
   			System.out.println("\nSending 'GET' request to URL : " + url);
   			System.out.println("Response Code : " + responseCode);

   			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
   			String inputLine;
   			

   			while ((inputLine = in.readLine()) != null) {
   				response.append(inputLine);
   			}
   			in.close();

   			// print result
   			resp=response.toString();
   		} catch (Exception e) {
   			resp="Error getting the timezone";
   			e.printStackTrace();
   		}
   		
   		return resp;
       }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}