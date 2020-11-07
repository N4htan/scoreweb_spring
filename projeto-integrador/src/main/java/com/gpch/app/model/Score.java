package com.gpch.app.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table (name="score_cli")
public class Score {
	
	
	@Column
	@EmbeddedId
	@JoinTable(name = "id_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "id_score"))
	 private Long id_score;
	
	@Column (name="score_jan")
	public int score_jan;
	
	@Column (name="score_fev")
	public int score_fev;
	@Column (name="score_mar")
	public int score_mar;
	@Column (name="score_abr")
	public int score_abr;
	@Column (name="score_mai")
	public int score_mai;
	@Column (name="score_jun")
	public int score_jun;
	@Column (name="score_jul")
	public int score_jul;
	@Column (name="score_ago")
	public int score_ago;
	@Column (name="score_set")
	public int score_set;
	@Column (name="score_out")
	public int score_out;
	@Column (name="score_nov")
	public int score_nov;
	@Column (name="score_dez")
	public int score_dez;
	
	
	
	@OneToOne(fetch = FetchType.LAZY)
	private User id;
	
	
	public Long getId_score() {
		return id_score;
	}
	public void setScore_cli(Long id_score) {
		this.id_score = id_score;
	}
	public int getScore_jan() {
		return score_jan;
	}
	public void setScore_jan(int score_jan) {
		this.score_jan = score_jan;
	}
	public int getScore_fev() {
		return score_fev;
	}
	public void setScore_fev(int score_fev) {
		this.score_fev = score_fev;
	}
	public int getScore_mar() {
		return score_mar;
	}
	public void setScore_mar(int score_mar) {
		this.score_mar = score_mar;
	}
	public int getScore_abr() {
		return score_abr;
	}
	public void setScore_abr(int score_abr) {
		this.score_abr = score_abr;
	}
	public int getScore_mai() {
		return score_mai;
	}
	public void setScore_mai(int score_mai) {
		this.score_mai = score_mai;
	}
	public int getScore_jun() {
		return score_jun;
	}
	public void setScore_jun(int score_jun) {
		this.score_jun = score_jun;
	}
	public int getScore_jul() {
		return score_jul;
	}
	public void setScore_jul(int score_jul) {
		this.score_jul = score_jul;
	}
	public int getScore_ago() {
		return score_ago;
	}
	public void setScore_ago(int score_ago) {
		this.score_ago = score_ago;
	}
	public int getScore_set() {
		return score_set;
	}
	public void setScore_set(int score_set) {
		this.score_set = score_set;
	}
	public int getScore_out() {
		return score_out;
	}
	public void setScore_out(int score_out) {
		this.score_out = score_out;
	}
	public int getScore_nov() {
		return score_nov;
	}
	public void setScore_nov(int score_nov) {
		this.score_nov = score_nov;
	}
	public int getScore_dez() {
		return score_dez;
	}
	public void setScore_dez(int score_dez) {
		this.score_dez = score_dez;
	}

}
