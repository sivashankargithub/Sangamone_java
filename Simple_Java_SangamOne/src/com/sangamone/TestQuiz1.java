package com.sangamone;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestQuiz1 {

	public static void main(String[] args) throws Exception {
		Map<String,String>map1=new HashMap<>();
		Map<String,String>wrong=new HashMap<>();
		int[] marks=new int[10];
		File f1=new File("Quiz_Capitals.csv");
		Scanner sc1=new Scanner(f1);
		sc1.nextLine();
		while(sc1.hasNext()) {
			String[] a1=sc1.nextLine().split(",");
			map1.put(a1[0], a1[1]);
		}
		sc1.close();
		System.out.println(map1);
		Scanner sc2=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("What is the Capital of "+map1.keySet().toArray()[i]);
			String ans=sc2.nextLine();
			if(ans.equalsIgnoreCase(map1.values().toArray()[i].toString())) {
				marks[i]=10;
			}
			else {
				marks[i]=0;
				wrong.put(map1.keySet().toArray()[i].toString(), map1.values().toArray()[i].toString());
			}
		}
		sc2.close();
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		System.out.println(total);
		System.out.println("Wrong Question and Answers \n"+wrong.entrySet());
	}

}
