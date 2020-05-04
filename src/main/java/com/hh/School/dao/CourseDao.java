package com.hh.School.dao;
/**
* @author hehuan
* @date 2020年5月1日下午4:40:15
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hh.School.entity.Course;
@Repository
public interface CourseDao extends JpaRepository<Course, Integer>{

}
