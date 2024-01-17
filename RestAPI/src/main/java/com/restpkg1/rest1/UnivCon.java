package com.restpkg1.rest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UnivCon {
	public ArrayList<String> loadData(String fname) throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			list1.add(str1);
		}
		sc1.close();
		return list1;
	}
	
	@GetMapping("/univ1")
	public ArrayList<String>getuniv() throws FileNotFoundException{
		return loadData("univIndia.txt");
	}
	
	@Autowired
	UnivRepo univRepo;
	
	@GetMapping("/getUnivData")
	public List<UnivEntity> getUniv() throws FileNotFoundException{
		return (List<UnivEntity>) univRepo.findAll();
	}
	
	@PostMapping("/getUnivData")
	public ResponseEntity<List<UnivEntity>> uploadData() throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		list1=getuniv();
		List<UnivEntity>records=new ArrayList<>();
		try {
			for(int i=0;i<list1.size();i++) {
				records=list1.get(i).lines().map(line -> new UnivEntity(line)).collect(Collectors.toList());
				univRepo.saveAll(records);
			}
			
			return ResponseEntity.ok(univRepo.findAll());
		}
		catch (Exception e) {
			return new ResponseEntity<List<UnivEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}
}
