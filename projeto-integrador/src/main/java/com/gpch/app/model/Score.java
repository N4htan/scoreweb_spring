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
	@Column (name="score_ano")
	public int score_ano;
	@Column (name="score_mes")
	public int score_mes;


	@OneToOne(fetch = FetchType.LAZY)
	private User id;

	public Long getId_score() {
		return id_score;
	}
	public void setScore_cli(Long id_score) {
		this.id_score = id_score;
	}
	public int getScore_ano() {
		return score_ano;
	}
	public void setScore_ano(int score_ano) {
		this.score_ano = score_ano;
	}
	public int getScore_fev() {
		return score_mes;
	}
	public void setScore_fev(int score_fev) {
		this.score_mes = score_fev;
	}
}
