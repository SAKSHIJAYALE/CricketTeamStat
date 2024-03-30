package com.cricket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
	 List<Player> findByCountry(String country);
	    List<Player> findByAverageScoreGreaterThan(int averageScore);
	    List<Player> findByAverageScoreGreaterThanOrderByDateOfBirthAsc(int averageScore);
	

}
