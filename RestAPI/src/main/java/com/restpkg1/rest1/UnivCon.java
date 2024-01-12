package com.restpkg1.rest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;

public class UnivCon {
	public ArrayList<String> loadData(String fname) throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		return list1;
		
	}
	@GetMapping("/univ1")
	public ArrayList<String>getuniv() throws FileNotFoundException{
		return loadData("univIndia.txt");
	}
}
