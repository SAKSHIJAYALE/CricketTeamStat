package com.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.entity.CricketMatch;

public interface CricketMatchRepository extends JpaRepository<CricketMatch, Integer>{

}
