package com.hh.School.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.hh.School.dao.StudentDao;
import com.hh.School.entity.Student;
import com.hh.School.service.StudentService;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

/**
* @author hehuan
* @date 2020年5月1日下午1:23:30
*/
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
//	@Override
//	public Student findByNamebyJPA(String name) {
//		return studentDao.findByNamebyJPA(name);
//	}

	@Override
	public Student findQueryHql(String name) {
		return studentDao.findQueryHql(name);
	}

	@Override
	public Student finByQuery(String name) {
		return studentDao.finByQuery(name);
	}
	
	@Override
	public Page<Student> findAll(int page, int size, int id) {
		return null;
		
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public void deleteStudent(Student student) {
		 studentDao.delete(student);
	}

	@Override
	public Student findByIDbyJPA(int id) {
		return studentDao.getOne(id);
	}

}
