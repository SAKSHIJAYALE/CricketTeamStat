package com.cricket.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.entity.CricketMatch;
import com.cricket.service.CricketMatchService;

@RestController
@RequestMapping("/match")
public class CricketMatchController {
  
  private CricketMatchService cricketMatchService;
  
  @PostMapping("/addMatch")
  public ResponseEntity<CricketMatch> addMatch(@RequestBody CricketMatch cricketMatch){
	  CricketMatch savecricketMatch=cricketMatchService.addMatch(cricketMatch);
		return new ResponseEntity<>( savecricketMatch,HttpStatus.CREATED);
  }
  
  @GetMapping("/get/{matchId}")
  public ResponseEntity<CricketMatch>findbyMatchId(@PathVariable ("MatchId")Integer matchId){
	  CricketMatch getcricketMatch=cricketMatchService.findbyMatchId(matchId);
		return new ResponseEntity<>( getcricketMatch,HttpStatus.FOUND);
  }
  
  @GetMapping("/getAll")
  public ResponseEntity<List<CricketMatch>> findAllMatches() {
      List<CricketMatch> getAll = cricketMatchService.findAllMatches();
      return new ResponseEntity<>(getAll, HttpStatus.FOUND);
  }

  
  @PutMapping("/update/{matchId}")
  public ResponseEntity<CricketMatch> updateMatch( @PathVariable ("MatchId")Integer matchId, @RequestBody CricketMatch cricketMatch){
	  CricketMatch upadatecricketMatch=cricketMatchService.updateMatch(matchId, cricketMatch);
		return new ResponseEntity<>( upadatecricketMatch,HttpStatus.ACCEPTED);
  }
}
