package com.hh.School.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hh.School.entity.Student;

/**
* @author hehuan
* @date 2020年5月1日下午1:07:56
*/
@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	//jpa的第一种查询方式 根据命名规范查询
	//Student findByNamebyJPA(String name);
	//HQL查询，根据实体进行查询
	@Query("select s from Student s where sname=?1")
	Student findQueryHql(String name);
	//原声sql进行查询
	@Query(value = "select * from Student where sname=?1",nativeQuery = true)
	Student finByQuery(String name);
	//复杂查询
	Page<Student> findAll(Specification<Student> sepc,Pageable pageable);
}
