package com.cricket.service;

import java.util.List;

import com.cricket.entity.CricketMatch;

public interface CricketMatchService {
	CricketMatch findbyMatchId(Integer matchId);
	CricketMatch updateMatch(Integer matchId, CricketMatch updateMatch);
	 String deleteMatch(Integer matchId);
	 CricketMatch addMatch(CricketMatch cricketMatch);
	//CricketMatch findAllMatch();
	List<CricketMatch> findAllMatches();
}
