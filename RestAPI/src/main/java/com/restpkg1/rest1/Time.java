package com.restpkg1.rest1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Time {
	@GetMapping("/getWords")
	public ArrayList<String> getWords() throws Exception {
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File("word.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		sc1.close();
		return list1;
	}
}
