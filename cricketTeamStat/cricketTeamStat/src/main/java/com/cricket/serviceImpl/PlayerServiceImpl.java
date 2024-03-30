package com.cricket.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.entity.Player;
import com.cricket.repository.PlayerRepository;
import com.cricket.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{
    
	@Autowired
private	PlayerRepository playerRepository;
	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stud
		List<Player> list= playerRepository.findAll();
		return list;
	}

	@Override
	public Player getPlayerbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Player> opt=playerRepository.findById(id);
		return opt.get();
	}

	@Override
	public Player updatePlayerbyId(Integer id, Player updatePlayer) {
		// TODO Auto-generated method stub
		Optional<Player> opt=playerRepository.findById(id);
		Player existPlayer=opt.get();
		existPlayer.setId(updatePlayer.getId());
		existPlayer.setName(updatePlayer.getName());
		existPlayer.setDateOfBirth(updatePlayer.getDateOfBirth());
		existPlayer.setId(updatePlayer.getId());
		//Player updatePlayer= playerRepository.save(existPlayer);
		  return playerRepository.save(existPlayer);
	}

	@Override
	public String deletebyId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Player>opt=playerRepository.findById(id);
		playerRepository.delete(opt.get());
		return "player with id:"+id+"delete successfully";
	}

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		
		  Player savePlayer = playerRepository.save(player);
		    return savePlayer;
		}
		

    public List<Player> getPlayersByCountry(String country) {
        return playerRepository.findByCountry(country);
    }
    public List<Player> getPlayersByAverageScoreGreaterThan(int averageScore) {
        return playerRepository.findByAverageScoreGreaterThan(averageScore);
    }

    public List<Player> getPlayersSortedByAverageScore(int averageScore) {
        return playerRepository.findByAverageScoreGreaterThanOrderByDateOfBirthAsc(averageScore);
    }
    

}
