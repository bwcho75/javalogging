package com.terry.logging.logbackCustom;

import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) 
    {

        log.info("event:order,name:terry,address:terrycho@google.com");
    }
}
