package com.cricket.service;

import java.util.List;

import com.cricket.entity.Player;

public interface PlayerService {
	List<Player> getAllPlayer();
	Player getPlayerbyId(Integer id);
	Player updatePlayerbyId(Integer id,Player player);
	String deletebyId(Integer id);
	Player addPlayer(Player player);
	List<Player> getPlayersByAverageScoreGreaterThan(int score);
	List<Player> getPlayersByCountry(String country);

}
