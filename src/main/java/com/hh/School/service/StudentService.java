package com.hh.School.service;
/**
* @author hehuan
* @date 2020年5月1日下午1:20:25
*/

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;

import com.hh.School.entity.Student;

public interface StudentService {
	//Student findByNamebyJPA(String name);
	Student findByIDbyJPA(int id);
	Student findQueryHql(String name);
	Student finByQuery(String name);
	Page<Student> findAll(int page,int size,int id);
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	void deleteStudent(Student student);
	
	List<Student> findAll();

}
