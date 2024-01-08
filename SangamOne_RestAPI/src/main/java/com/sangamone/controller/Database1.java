package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entity.Entity1;
import com.sangamone.repo.DataRepo;


@RestController
public class Database1 {
	@Autowired DataRepo dataRepo;
	
	@GetMapping("/getData")
	public List<Entity1> getCompanyDetails(){
		return dataRepo.findAll();
	}
}
