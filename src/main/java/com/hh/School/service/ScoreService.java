package com.hh.School.service;

import java.util.List;

import com.hh.School.entity.Course;
import com.hh.School.entity.Score;
import com.hh.School.entity.ScorePK;

/**
* @author hehuan
* @date 2020年5月1日下午4:47:16
*/
public interface ScoreService {
	Score saveScore(Score score);
	Score updateScore(Score score);
	void deleteScore(Score score);
	List<Score> findAll();
	Score findByIDbyJPA(ScorePK scorePK);
	
}
