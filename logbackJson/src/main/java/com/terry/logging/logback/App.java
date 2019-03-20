package com.terry.logging.logback;

import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws JsonProcessingException
    {

        log.info("hello log4j");
    }
}
