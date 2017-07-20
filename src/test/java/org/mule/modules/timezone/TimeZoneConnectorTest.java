package org.mule.modules.timezone;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeZoneConnectorTest {
	
	TimeZoneConnector timeZoneConnector = new TimeZoneConnector();

	
	
	@Test
	public void testGettimezone() {
		System.out.println(timeZoneConnector.gettimezone("40.567", "-95.345"));
	}

}
