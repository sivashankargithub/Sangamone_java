package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterestCal2 {

	public static void main(String[] args) throws FileNotFoundException{
		
		File f1 =new File("Interest.csv");
		String[] list1=null;
		List<String>date1=new ArrayList<>();
		List<String>date2=new ArrayList<>();
		date2.add("01-Jul-2023");
		date2.add("02-Jul-2023");
		date2.add("03-Jul-2023");
		date2.add("04-Jul-2023");
		date2.add("05-Jul-2023");
		date2.add("06-Jul-2023");
		date2.add("07-Jul-2023");
		date2.add("08-Jul-2023");
		date2.add("09-Jul-2023");
		date2.add("10-Jul-2023");
		date2.add("11-Jul-2023");
		date2.add("12-Jul-2023");
		date2.add("13-Jul-2023");
		date2.add("14-Jul-2023");
		date2.add("15-Jul-2023");
		date2.add("16-Jul-2023");
		date2.add("17-Jul-2023");
		date2.add("18-Jul-2023");
		date2.add("19-Jul-2023");
		date2.add("20-Jul-2023");
		date2.add("21-Jul-2023");
		date2.add("22-Jul-2023");
		date2.add("23-Jul-2023");
		date2.add("24-Jul-2023");
		date2.add("25-Jul-2023");
		date2.add("26-Jul-2023");
		date2.add("27-Jul-2023");
		date2.add("28-Jul-2023");
		date2.add("29-Jul-2023");
		date2.add("30-Jul-2023");
		date2.add("31-Jul-2023");
		
		
		List<Integer>credit1=new ArrayList<>();
		List<Integer>debit1=new ArrayList<>();
		List<String>details1=new ArrayList<>();
		List<Double>total1=new ArrayList<>();
		Scanner sc=new Scanner(f1);
		String info1=sc.nextLine();
		
		for(int i=0;i<19;i++) {
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
		int principal1 =opening1+credit1.get(0)-debit1.get(0);
		double time1=1.0/365;
		double rate1=5.0/100;
		double interest1=principal1*time1*rate1;
		total1.add(interest1);
		//System.out.println(interest1);
		
		for(int i=1;i<date1.size();i++) {
			
			opening1=principal1;
			principal1=opening1+credit1.get(i)-debit1.get(i);
			time1=1.0/365;
			rate1=5.0/100;
			interest1=principal1*time1*rate1;
			total1.add(interest1);
		}
		//System.out.println(total1);
		double tot_interest = 0.0;
		for(int i=0;i<total1.size();i++) {
			tot_interest+=total1.get(i);
		}
		System.out.println(tot_interest);
	}
}