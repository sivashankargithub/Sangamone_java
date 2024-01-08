package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entity.GetDataEntity;
import com.sangamone.repo.GetDataRepo;


@RestController
public class GetDataController {
	@Autowired
	GetDataRepo getrepo;
	
	
	@GetMapping("/getAllNames")
	public List<GetDataEntity> getnames(){
		return getrepo.findAll();
	}
}
