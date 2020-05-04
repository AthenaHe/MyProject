package com.hh.School.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.School.dao.ScoreDao;
import com.hh.School.entity.Score;
import com.hh.School.entity.ScorePK;
import com.hh.School.service.ScoreService;

/**
* @author hehuan
* @date 2020年5月1日下午9:06:04
*/
@Service
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	ScoreDao scoreDao;
	@Override
	public Score saveScore(Score score) {
		return scoreDao.save(score);
	}

	@Override
	public Score updateScore(Score score) {
		return scoreDao.save(score);
	}

	@Override
	public void deleteScore(Score score) {
		scoreDao.delete(score);
		
	}

	@Override
	public List<Score> findAll() {
		return scoreDao.findAll();
	}

	@Override
	public Score findByIDbyJPA(ScorePK scorePK) {
		return scoreDao.getOne(scorePK);
	}

}
