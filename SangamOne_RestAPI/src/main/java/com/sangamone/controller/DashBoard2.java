package com.sangamone.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoard2 {
	public ArrayList<String> loadData(String fname)throws Exception{
		ArrayList<String>list1=new ArrayList<>();
		File f1 = new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			list1.add(str1);
		}
		return list1;
	}
	
	@GetMapping("/getUniv1")
	public ArrayList<String> getUniv1()throws Exception{
		return loadData("univIndia.txt");
	}
	
	@GetMapping("/getUniv2")
	public ArrayList<String> getUniv2()throws Exception{
		return loadData("univUSA.txt");
	}
	
	@GetMapping("/getUniv3")
	public ArrayList<String> getUniv3()throws Exception{
		return loadData("univUK.txt");
	}
}
