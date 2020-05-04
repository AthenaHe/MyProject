package com.hh.School.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.School.dao.TheClassDao;
import com.hh.School.entity.TheClass;
import com.hh.School.service.TheClassService;

/**
* @author hehuan
* @date 2020年5月1日下午4:02:48
*/
@Service
public class TheClassServiceImpl implements TheClassService{
	@Autowired
	private TheClassDao theClassDao;
	@Override
	public TheClass saveTheClass(TheClass theClass) {
		return theClassDao.save(theClass);
	}

	@Override
	public TheClass updateTheClass(TheClass theClass) {
		return theClassDao.save(theClass);
	}

	@Override
	public void deleteTheClass(TheClass theClass) {
		theClassDao.delete(theClass);
		
	}

	@Override
	public List<TheClass> findAll() {
		return theClassDao.findAll();
	}

	@Override
	public TheClass findByIDbyJPA(int id) {
		return theClassDao.getOne(id);
	}

}
