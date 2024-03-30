package com.cricket.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.entity.CricketMatch;
import com.cricket.entity.Player;
import com.cricket.repository.CricketMatchRepository;
import com.cricket.service.CricketMatchService;

@Service
public class CricketMatchServiceImpl  implements CricketMatchService{

	
	@Autowired
	private CricketMatchRepository cricketMatchRepository;
	
	@Override
	public CricketMatch findbyMatchId(Integer matchId) {
		// TODO Auto-generated method stub
		Optional<CricketMatch>opt=cricketMatchRepository.findById(matchId);
		return opt.get();
	}

	@Override
	public CricketMatch updateMatch(Integer matchId, CricketMatch updateMatch) {
		// TODO Auto-generated method stub
		Optional<CricketMatch>opt=cricketMatchRepository.findById(matchId);
		CricketMatch existMatch=opt.get();
		existMatch.setMatchId(updateMatch.getMatchId());
		existMatch.setStadium(updateMatch.getStadium());
		existMatch.setScore(updateMatch.getScore());
	    return updateMatch;
	}

	@Override
	public String deleteMatch(Integer matchId) {
		// TODO Auto-generated method stub
		Optional<CricketMatch>opt=cricketMatchRepository.findById(matchId);
		cricketMatchRepository.delete(opt.get());
		return "player with matchId:"+matchId+"delete successfully";
	}

	@Override
	public CricketMatch addMatch(CricketMatch cricketMatch) {
		// TODO Auto-generated method stub
		  CricketMatch saveMatch = cricketMatchRepository.save(cricketMatch);
		    return saveMatch;
		
	}

	@Override
	public List<CricketMatch>findAllMatches() {
		// 
			// TODO Auto-generated method stud
			List<CricketMatch> list= cricketMatchRepository.findAll();
			return list;
		}



}
