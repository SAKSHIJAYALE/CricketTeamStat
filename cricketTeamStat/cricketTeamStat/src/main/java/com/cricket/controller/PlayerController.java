package com.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cricket.entity.Player;
import com.cricket.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	private PlayerService playerService;

	 @PostMapping("/savePlayer")
	public ResponseEntity<Player>addPlayer(@RequestBody Player player){
		Player savePlayer=playerService.addPlayer(player);
		return new ResponseEntity<>(savePlayer,HttpStatus.CREATED);
		
	}
	 @GetMapping("/get/{id}")
	 public ResponseEntity<Player>getPlayerbyId(@PathVariable ("id") Integer id){
		return new ResponseEntity<>(playerService.getPlayerbyId(id),HttpStatus.FOUND);
		 
	 }
	 @GetMapping("/getAll")
	 public ResponseEntity<List<Player>>getAllPlayer(@RequestBody Player player){
		return new ResponseEntity<>(playerService.getAllPlayer(),HttpStatus.FOUND);
		 
	 }
	 
	 @PutMapping("/updatePlayer/{id}")
	 public ResponseEntity<Player>updatePlayer(@PathVariable ("id") Integer id,@RequestBody Player player){
			return new ResponseEntity<>(playerService.getPlayerbyId(id),HttpStatus.FOUND);
			 
	 } 
	 

	    @GetMapping("/average-score/{score}")
	    public ResponseEntity<List<Player>> getPlayersByAverageScoreGreaterThan(@PathVariable int score) {
	        List<Player> players = playerService.getPlayersByAverageScoreGreaterThan(score);
	        return ResponseEntity.ok(players);
	    }
	    
	    @GetMapping("/country/{country}")
	    public ResponseEntity<List<Player>> getPlayersByCountry(@PathVariable String country) {
	        List<Player> players = playerService.getPlayersByCountry(country);
	        return ResponseEntity.ok(players);
	    }
}
