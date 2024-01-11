package com.sangamone.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoard3 {
	
	public ArrayList<String> loadData(String fname) throws IOException{
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			list1.add(str1);
		}
		return list1;
	}
	
	@GetMapping("/getUniv11")
	public ArrayList<String> getUniv1() throws IOException{
		return loadData("univIndia.txt");
	}
	
	@GetMapping("/getUniv12")
	public ArrayList<String> getUniv2() throws IOException{
		return loadData("univUSA.txt");
	}
}
