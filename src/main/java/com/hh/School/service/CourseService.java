package com.hh.School.service;

import java.util.List;

import com.hh.School.entity.Course;
import com.hh.School.entity.TheClass;

/**
* @author hehuan
* @date 2020年5月1日下午4:47:07
*/
public interface CourseService {
	Course saveCourse(Course course);
	Course updateCourse(Course course);
	void deleteCourse(Course course);
	List<Course> findAll();
	Course findByIDbyJPA(int cno);
}
