package com.terry.logging.logbackCustom;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.contrib.json.classic.JsonLayout;

import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomLayout extends JsonLayout {
    @Override
    protected void addCustomDataToJsonMap(Map<String, Object> map, ILoggingEvent event) {
        long timestampMillis = event.getTimeStamp();
        map.put("timestampSeconds", timestampMillis / 1000);
        map.put("timestampNanos", (timestampMillis % 1000) * 1000000);
        map.put("severity", String.valueOf(event.getLevel()));
        map.put("MYMESSAGE", event.getMessage());
        map.remove("message");
        
        
        // JSON 로깅을 넣을 수 는 있는데, Logger.log에서 이걸 넘길 수 가 없다. 
       	Map<String,String> json = new TreeMap();
       	json.put("name", "terry");
       	json.put("email","terry@mycompany.com");
    	String msg;
		try {
			msg = new ObjectMapper().writeValueAsString(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	map.put("jsonpayload", json);
    	
    }
}