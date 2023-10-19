package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterestCal2 {
	public static void main(String[] args) throws FileNotFoundException{
		
		File f1 =new File("Interest.csv");
		String[] list1=null;
		List<String>date1=new ArrayList<>();
		List<Integer>credit1=new ArrayList<>();
		List<Integer>debit1=new ArrayList<>();
		List<String>details1=new ArrayList<>();
		List<String>date2=new ArrayList<>();
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate mydate1;
		LocalDate mydate2;
		String mydate3;
		for(int i=0;i<62;i++) {
			mydate1=LocalDate.of(2023, 7, 1);
			mydate2=mydate1.plusDays(i);
			mydate3=mydate2.format(dtf1);
			date2.add(mydate3);
		}
		List<Double>interest1=new ArrayList<>();
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
		System.out.println(bank1(date1,date2,credit1,debit1,interest1));
		System.out.println();
		System.out.println(bank2(date1,date2,credit1,debit1));
	}
	public static String bank1(List<String> mydt1, List<String> mydt2, List<Integer> cred1, List<Integer> deb1, List<Double> tint) {
		
		List<String> date1=mydt1;
		List<String> date2=mydt2;
		List<Integer> credit1=cred1;
		List<Integer> debit1=deb1;
		List<Double> interest=tint;
		
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
		for(int i=0;i<date2.size();i++) {
			dt1=date2.get(i);
			
			if(dt1.equals(date1.get(pos))) {
				credit=credit1.get(pos);
				debit=debit1.get(pos);
				pos=pos+1;
			}
			else {
				credit=0;
				debit=0;
			}
			opening1=principal1;
			principal1=opening1+credit-debit;
			interest1=principal1*time1*rate1;
			interest.add(interest1);
			intTot=intTot+interest1;
			//System.out.print(date2.get(i)+"  ");
			//System.out.println(interest1);
		}
		//System.out.print("Bank1 has given interest of Rs "+intTot);
		return "Bank1 has given the interest of "+intTot;
	}
	public  static String bank2(List<String> mydt1, List<String> mydt2, List<Integer> cred1, List<Integer> deb1) {
		
		List<String> date1=mydt1;
		List<Integer> credit1=cred1;
		List<Integer> debit1=deb1;
		
		int principal1=0;
		double time1=31.0/365.0;
		double rate1=7.0/100.0;
		int opening1=0;
		double totInt=0.0;
		for(int i=0;i<date1.size();i++) {
			opening1=principal1;
			principal1=opening1+credit1.get(i)-debit1.get(i);
		}
		totInt=principal1*time1*rate1;
		
		return "Bank2 has given the interest of "+totInt;
	}
}