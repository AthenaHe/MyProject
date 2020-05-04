package com.hh.School.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hh.School.entity.Score;
import com.hh.School.entity.ScorePK;

/**
* @author hehuan
* @date 2020年5月1日下午4:41:51
*/
@Repository
public interface ScoreDao extends JpaRepository<Score, ScorePK>{

}
