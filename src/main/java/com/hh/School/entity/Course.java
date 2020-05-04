package com.hh.School.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author hehuan
* @date 2020年5月1日下午12:09:16
*/
@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "cno")
    private int cno;
    @Column(name = "coursename",length = 20)
    private String coursename;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
    

}
