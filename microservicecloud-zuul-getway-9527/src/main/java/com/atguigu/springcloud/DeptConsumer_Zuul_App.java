package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
/**
 * 网关代理
 * @author nineclient
 * 通过网关访问http://zuul.com/微服务名称/get/dept/1
 */
@EnableZuulProxy
public class DeptConsumer_Zuul_App {
   
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer_Zuul_App.class, args);
	}
}
