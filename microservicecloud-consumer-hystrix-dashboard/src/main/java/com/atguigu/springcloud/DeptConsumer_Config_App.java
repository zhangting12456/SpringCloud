package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableConfigServer
public class DeptConsumer_Config_App {
   
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer_Config_App.class, args);
	}
}
