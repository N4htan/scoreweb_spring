package com.gpch.app.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Data
@Entity
@Table (name="score_cli")
public class Score {


    @Column
    @EmbeddedId
    @JoinTable(name = "id_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "id_score"))
    private Long id_score;
    @Column(name = "score_ano")
    public int score_ano;
    @Column(name = "score_mes")
    public int score_mes;


    @OneToOne(fetch = FetchType.LAZY)
    private User id;
}