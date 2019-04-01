package com.terry.logging.logbackMDC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;


public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	log.info("Hello logback");
    	
    	MDC.put("userid", "terrycho");
    	MDC.put("event", "orderProduct");
    	MDC.put("transactionId", "a123");
    	log.info("mdc test");
    	
    	MDC.clear();
    	log.info("after mdc.clear");
    }
}
