
package org.mule.modules.timezone.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.timezone.TimeZoneConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TimeZoneConnectorProcessAdapter</code> is a wrapper around {@link TimeZoneConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T12:31:05-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class TimeZoneConnectorProcessAdapter
    extends TimeZoneConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TimeZoneConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TimeZoneConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TimeZoneConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TimeZoneConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TimeZoneConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TimeZoneConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
