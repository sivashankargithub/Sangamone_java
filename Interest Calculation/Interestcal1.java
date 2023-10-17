package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S2 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("Interest.csv");
		List<String>date1=new ArrayList<>();
		List<Integer>debit1=new ArrayList<>();
		List<Integer>credit1=new ArrayList<>();
		String[] list1;
		
		
		
		Scanner sc=new Scanner(f1);
		String info1=sc.nextLine();
		for(int i=0;i<19;i++) {
			list1=sc.nextLine().split(",");
			date1.add(list1[0]);
			 if(list1[1]==""){
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
			
		}
		
		double intTot=0;
		String dt1="";	
		int opening1=0;
		int principal1=0;
		double time1=1.0/365;
		double rate1=5.0/100;
		double interest1=0;
		int credit=0;
		int debit=0;
		int pos=0;
		
		dt1="01-Jul-2023";
		if(dt1.equals(date1.get(0))) {
			credit=credit1.get(0);
			debit=debit1.get(0);
		}
		else {
			credit=0;
			debit=0;
		}
		
		principal1=opening1+credit-debit;
		//System.out.println(time1);
		interest1=principal1*time1*rate1;
		System.out.println(interest1);
	}

}
