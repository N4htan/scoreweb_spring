package com.gpch.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpch.app.model.User;

@Repository
public interface ScoreRepository extends JpaRepository <User, Long>{}