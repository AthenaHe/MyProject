package com.hh.School.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
* @author hehuan
* @date 2020年5月3日下午9:31:36
* 主键类
*/
@Embeddable
public class ScorePK implements Serializable{
	@ManyToOne(targetEntity = Student.class)
	//@JoinColumn(name = "sno",nullable = false)
    private Student student;
	@ManyToOne(targetEntity = Course.class)
	//@JoinColumn(name = "cno",nullable = false)
	private Course course;
	
	public ScorePK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScorePK(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScorePK other = (ScorePK) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	
}