package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//boot --->spring applicationContext.xml ---- @Configuration配置 
//configBean == applicationContext.xml
public class ConfigBean {
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate(){
	  return new RestTemplate();
  }
}
