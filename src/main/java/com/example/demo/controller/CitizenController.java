package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.newEntity.Citizen;
import com.example.demo.repository.CitizenRepository;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	CitizenRepository repo;
	
	@GetMapping(path="/hello")
	public ResponseEntity<String> getName(){
		return new ResponseEntity<>("hello to the world",HttpStatus.OK);
	}
	@PostMapping(path="/save")
	public ResponseEntity<Citizen> getName(@RequestBody Citizen ncitizen){
		Citizen citizen=repo.save( ncitizen);
		return new ResponseEntity<>(citizen,HttpStatus.OK);
	}

	
	
}
