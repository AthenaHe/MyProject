package com.hh.School.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import javassist.SerialVersionUID;

/**
* @author hehuan
* @date 2020年5月1日下午12:09:22
* 成绩实体类
*/
//通过复合主键对象 + @Embeddable 和实体对象 + @EmbeddedId注解：
@Entity
@Table(name = "score")
public class Score{
	//private static final long SerialVersionUID = 1L;
	@EmbeddedId
	private ScorePK scorePK;
    private int score;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(ScorePK scorePK, int score) {
		super();
		this.scorePK = scorePK;
		this.score = score;
	}
	public ScorePK getScorePK() {
		return scorePK;
	}
	public void setScorePK(ScorePK scorePK) {
		this.scorePK = scorePK;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
