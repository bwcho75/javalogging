package com.terry.logging.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        log.info("Hello slf4j");
    }
}
