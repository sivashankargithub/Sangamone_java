package com.sangamone.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dashboard2 {
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
	
	@GetMapping("getFetchData1")
	public ArrayList<String> fetchData1()throws Exception{
		return loadData("input2024.txt");
	}
	
	@GetMapping("getFetchData2")
	public ArrayList<String> fetchData2()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData3")
	public ArrayList<String> fetchData3()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData4")
	public ArrayList<String> fetchData4()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData5")
	public ArrayList<String> fetchData5()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData6")
	public ArrayList<String> fetchData6()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData7")
	public ArrayList<String> fetchData7()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData8")
	public ArrayList<String> fetchData8()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData9")
	public ArrayList<String> fetchData9()throws Exception{
		return loadData("covidDeaths.txt");
	}
	
	@GetMapping("getFetchData10")
	public ArrayList<String> fetchData10()throws Exception{
		return loadData("covidDeaths.txt");
	}

	
}
