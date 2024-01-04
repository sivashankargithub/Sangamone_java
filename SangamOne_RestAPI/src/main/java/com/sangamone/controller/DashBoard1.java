package com.sangamone.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoard1 {
	public ArrayList<String> fetchData1() throws IOException{
		ArrayList<String>list1=new ArrayList<>();
		String fname1="input2024.txt";
		File f1=new File(fname1);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			list1.add(str1);
		}
		return list1;
	}
	
	public ArrayList<String> fetchData2() throws IOException{
		ArrayList<String>list2=new ArrayList<>();
		String fname2="covidDeaths.txt";
		File f2=new File(fname2);
		Scanner sc2=new Scanner(f2);
		while(sc2.hasNext()) {
			String str1=sc2.nextLine();
			list2.add(str1);
		}
		return list2;
	}
	
	@GetMapping("/holidays")
	public ArrayList<String> getHolidays() throws IOException{
		DashBoard1 info1=new DashBoard1();
		return info1.fetchData1();
	}
	
	@GetMapping("/covidDeaths")
	public ArrayList<String> getCovidDeaths() throws IOException{
		DashBoard1 info2=new DashBoard1();
		return info2.fetchData2();
	}
	
	

}
