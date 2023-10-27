package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz1 {
	public static void test1(String f2) throws FileNotFoundException {
		List<String>country=new ArrayList<>();
		List<String>capital=new ArrayList<>();
		List<Integer>marks=new ArrayList<>();
		List<Integer>wrong=new ArrayList<>();
		int total=0;
		String[] list1;
		File f1=new File(f2);
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
			list1=sc.nextLine().split(",");
			country.add(list1[0]);
			capital.add(list1[1]);
		}
		sc.close();
		Scanner sc2=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("What is the capital of "+country.get(i)+": ");
			String response1=sc2.nextLine();
			if(response1.equals(capital.get(i))) {
				marks.add(10);
			}
			else {
				marks.add(0);
				wrong.add(i);
			}
			total=total+marks.get(i);
		}
		System.out.println(total);
		for(int i=0;i<wrong.size();i++) {
			System.out.print(country.get(wrong.get(i))+" : "+capital.get(wrong.get(i)));
		    System.out.println();
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		test1("Capitals.csv");
	}
}