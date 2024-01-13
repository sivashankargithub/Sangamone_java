package com.restpkg2.universities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivController {
	public ArrayList<String> loadData(String fname) throws Exception{
		ArrayList<String> list1 = new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}
	
	@GetMapping("/getUniv")
	public ArrayList<String> getUniv() throws Exception{
		return loadData("univIndia.txt");
	}
	@Autowired
	UnivRepo univRepo;
	
	@PostMapping("/uploadData")
	public String uploadData() throws Exception{
		ArrayList<String>list1=new ArrayList<>();
		list1=loadData("univIndia.txt");
		List<UnivEntity> data = new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			data=list1.get(i).lines().map(line -> new UnivEntity(line)).collect(Collectors.toList());
			univRepo.saveAll(data);
		}
		
		return "inserted succsessfully";
	}
	

}
