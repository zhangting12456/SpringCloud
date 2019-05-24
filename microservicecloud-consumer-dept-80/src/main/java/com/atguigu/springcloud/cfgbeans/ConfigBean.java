package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
//boot --->spring applicationContext.xml ---- @Configuration配置 
//configBean == applicationContext.xml
public class ConfigBean {
  @Bean
  @LoadBalanced //负载均衡------轮询算法
  public RestTemplate getRestTemplate(){
	  return new RestTemplate();
  }
  
  @Bean
  public IRule myRule(){
	  return new RandomRule();// 用随机的算法替换轮询算法
  }
}
