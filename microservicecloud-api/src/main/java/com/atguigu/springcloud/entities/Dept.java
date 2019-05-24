package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
@Setter
@Getter
public class Dept implements Serializable{ //Dept(Entity) orm 类表关系映射
    private Long deptno; //主键
    private String dname; //部门名称
  //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，
   //同一个信息被存储到不同的数据库
    private String db_source;
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	} 
    
}
