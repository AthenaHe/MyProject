package com.hh.School.service;

import java.util.List;

import com.hh.School.entity.TheClass;

/**
* @author hehuan
* @date 2020年5月1日下午4:00:19
*/
public interface TheClassService {
	TheClass saveTheClass(TheClass theClass);
	TheClass updateTheClass(TheClass theClass);
	void deleteTheClass(TheClass theClass);
	List<TheClass> findAll();
	TheClass findByIDbyJPA(int classid);
}
