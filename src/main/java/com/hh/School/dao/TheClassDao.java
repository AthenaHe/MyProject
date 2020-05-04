package com.hh.School.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hh.School.entity.TheClass;

/**
* @author hehuan
* @date 2020年5月1日下午3:57:29
*/
@Repository
public interface TheClassDao extends JpaRepository<TheClass, Integer>{
}
