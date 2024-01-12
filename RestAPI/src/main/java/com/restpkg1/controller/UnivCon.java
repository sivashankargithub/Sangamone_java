package com.restpkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restpkg1.entity.UnivEntity;
import com.restpkg1.repo.UnivRepo;

@RestController
public class UnivCon {
	@Autowired
	UnivRepo univRepo;
	
	@GetMapping("/getUnivData")
	public List<UnivEntity> getUniv(){
		return univRepo.findAll();
	}
}
