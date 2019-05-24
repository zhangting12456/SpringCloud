package com.atguigu.springcloud.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entities.Dept;
//接口要加@Mapper注解
@Mapper
public interface DeptDao {
   public boolean addDept(Dept dept);
   public Dept findById(Long id);
   public List<Dept> findAll();
}
