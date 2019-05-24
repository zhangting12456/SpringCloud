package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
//自定义ribbon的规则
@Configuration
public class MySelfRule {
   @Bean
   public IRule myRule(){
	   return new RandomRule();//随机算法
	   
   }
}
