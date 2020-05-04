package com.hh.School.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author hehuan
* @date 2020年5月1日下午12:09:04
*/
@Entity
@Table(name = "class")
public class TheClass {
	@Id
	@Column(name = "classid")
	//表示mysql主键自增策略：@GeneratedValue(strategy = GenerationType.IDENTITY)
	//表示oracle主键自增策略：@GeneratedValue(strategy = GenerationType.AUTO)
	private int classid;
	@Column(name = "classname",length = 20)
	private String classname;
	
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}	
}

