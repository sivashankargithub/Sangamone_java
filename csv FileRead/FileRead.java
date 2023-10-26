package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>country=new ArrayList<>();
		List<String>capital=new ArrayList<>();
		String[] list1;
		File f1=new File("Capitals.csv");
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
			list1=sc.nextLine().split(",");
			country.add(list1[0]);
			capital.add(list1[1]);
		}
		System.out.println(country);
		System.out.println(capital);
		sc.close();
	}

}