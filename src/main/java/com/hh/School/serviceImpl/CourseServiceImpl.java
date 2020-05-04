package com.hh.School.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.School.dao.CourseDao;
import com.hh.School.entity.Course;
import com.hh.School.service.CourseService;

/**
* @author hehuan
* @date 2020年5月1日下午4:59:45
*/
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDao courseDao;
	@Override
	public Course saveCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(Course course) {
		courseDao.delete(course);
		
	}

	@Override
	public List<Course> findAll() {
		return courseDao.findAll();
	}

	@Override
	public Course findByIDbyJPA(int cno) {
		return courseDao.getOne(cno);
	}

}
