package com.terry.logging.jsonlog;

import java.util.Map;
import java.util.TreeMap;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.message.ObjectMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static Marker MARKER_WHITESPACE = MarkerManager.getMarker("ANA_WHITESPACE");
	private static Logger log = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	Map<String,String> map = new TreeMap();
    	map.put("name", "terry");
    	map.put("email","terry@mycompany.com");
    	ObjectMessage msg = new ObjectMessage(map);
    	//log.info(msg);
    	log.info(msg);
    }
}
