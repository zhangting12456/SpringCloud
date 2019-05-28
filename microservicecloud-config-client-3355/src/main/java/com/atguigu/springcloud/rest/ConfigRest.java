package com.atguigu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRest {
    @Value("${spring.application.name}")
	private String applicationName;
    
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaService;
    
    @Value("${server.port}")
    private String port;
    
    @RequestMapping("/config")
    public String getConfig(){
    	String str = "applicationName: "+applicationName+"\t eurekaService: "+eurekaService+"\t port :"+port;
    	System.out.println("******str: "+ str);
    	return str;
    }
}
