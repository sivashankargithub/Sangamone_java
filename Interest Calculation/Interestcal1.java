package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Interestcal1 {
	public static void main(String[] args) throws FileNotFoundException {
		File f1 =new File("Interest.csv");
		String[] list1;
		List<String>date1=new ArrayList<>();
		List<Integer>credit1=new ArrayList<>();
		List<Integer>debit1=new ArrayList<>();
		List<String>details1=new ArrayList<>();
		Scanner sc=new Scanner(f1);
		for(int i=0;i<2;i++) {
			String info1=sc.nextLine();
			list1=sc.nextLine().split(",");
			date1.add(list1[0]);
			if(list1[1]=="") {
				credit1.add(0);
			}
			else {
				credit1.add(Integer.parseInt(list1[1]));
			}
			if(list1[2]=="") {
				debit1.add(0);
			}
			else {
				debit1.add(Integer.parseInt(list1[2]));
			}
			details1.add(list1[3]);
		}
		int opening1=0;
		int principal1=opening1+credit1.get(0)-debit1.get(0);
		double time1=1.0/365;
		double rate1=5.0/100;
		double interest1=principal1*time1*rate1;
		System.out.println(interest1);
		
	}

}
