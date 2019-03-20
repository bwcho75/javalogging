package com.terry.logging.jsonlog;

import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Slf4j 
{
	private static Logger log = LoggerFactory.getLogger(Slf4j.class);
    public static void main( String[] args ) throws JsonProcessingException
    {
       	Map<String,String> map = new TreeMap();
    	map.put("name", "terry");
    	map.put("email","terry@mycompany.com");
    	String msg = new ObjectMapper().writeValueAsString(map);
    	System.out.println("MSG:"+msg);
    	log.info(msg);
    }
}
