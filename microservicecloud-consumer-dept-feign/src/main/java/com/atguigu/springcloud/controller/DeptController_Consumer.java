package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	
	private static final String REST_URL_PREFIX ="http://MICROSERVICECLOUD-DEPT";
     @Autowired
     private RestTemplate restTemplate;
     @Autowired
     private DeptClientService deptClientService;
     
     @RequestMapping(value="/consumer/dept/add")
     public boolean add(Dept dept){
    	 
    	 return this.deptClientService.add(dept);
     }
     @RequestMapping(value="/consumer/dept/get/{id}")
     public Dept get(@PathVariable("id") Long id){
    	 return this.deptClientService.get(id);
     }
     
     @RequestMapping(value="/consumer/dept/list")
     public List<Dept> list(){
    	 return this.deptClientService.list();
     }
  // 测试@EnableDiscoveryClient,消费端可以调用服务发现
 	@RequestMapping(value = "/consumer/dept/discovery")
 	public Object discovery()
 	{
 		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
 	}
}
