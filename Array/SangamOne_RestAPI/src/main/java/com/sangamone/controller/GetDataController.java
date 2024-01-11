package com.sangamone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entity.GetDataEntity;
import com.sangamone.repo.GetDataRepo;
import com.sangamone.repo.JustInter;


@RestController
public class GetDataController {
	
	GetDataRepo getrepo;
	
	
	JustInter ji;
	
	
	@GetMapping("/getAllNames")
	public List<GetDataEntity> getnames(){
		return getrepo.findAll();
	}
	
	@GetMapping("/getNamesById/{name}")
	public Optional<GetDataEntity> method2(String name){
		return ji.findById(name);
	}
	
	
}
