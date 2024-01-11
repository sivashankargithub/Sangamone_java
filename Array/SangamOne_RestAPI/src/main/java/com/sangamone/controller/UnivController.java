package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entity.UnivEntity;
import com.sangamone.repo.UnivRepo;

@RestController
public class UnivController {
	@Autowired
	UnivRepo univRepo;
	
	@GetMapping("/getUniv1")
	public List<UnivEntity> getUniv1(){
		return univRepo.findAll();
		
	}
	
}
