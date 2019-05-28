package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication

public class DeptConsumer_Config_Client_App {
   
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer_Config_Client_App.class, args);
	}
}
