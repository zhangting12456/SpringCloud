package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
@EnableHystrix
public class DeptProvideer8001_Hystrix_App {
   public static void main(String[] args){
	  SpringApplication.run(DeptProvideer8001_Hystrix_App.class, args); 
   }
}
