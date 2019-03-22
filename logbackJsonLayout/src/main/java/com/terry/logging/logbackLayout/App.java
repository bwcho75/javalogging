package com.terry.logging.logbackLayout;

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

        log.info("This is custom layout");
    }
}
