package com.hh.School.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
* @author hehuan
* @date 2020年5月3日下午4:36:21
*/
@Entity
@Table(name = "student")
public class Student{
		@Id
		@Column(name = "sno")
	    private int sno;
	    @Column(name = "sname",length = 20)
	    private String sname;
	    @ManyToOne(targetEntity = TheClass.class)
	    private TheClass theClass;
	    
	    
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public TheClass getTheClass() {
			return theClass;
		}
		public void setTheClass(TheClass theClass) {
			this.theClass = theClass;
		}
		
		
}
