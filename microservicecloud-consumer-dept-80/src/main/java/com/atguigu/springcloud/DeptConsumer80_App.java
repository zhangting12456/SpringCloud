package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能够加载自定义的Ribbon配置类，从而使配置生效
//name---微服务的名称；configuration----配置类的类名；

@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_App {
   
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
