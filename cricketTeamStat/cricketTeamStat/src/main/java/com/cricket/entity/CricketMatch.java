package com.cricket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CricketMatch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer matchId;
     Integer score;
	String Stadium;

}
