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
		List<Double>interest=new ArrayList<>();
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
		date2.add("01-Aug-2023");
		date2.add("02-Aug-2023");
		date2.add("03-Aug-2023");
		date2.add("04-Aug-2023");
		date2.add("05-Aug-2023");
		date2.add("06-Aug-2023");
		date2.add("07-Aug-2023");
		date2.add("08-Aug-2023");
		date2.add("09-Aug-2023");
		date2.add("10-Aug-2023");
		date2.add("11-Aug-2023");
		date2.add("12-Aug-2023");
		date2.add("13-Aug-2023");
		date2.add("14-Aug-2023");
		date2.add("15-Aug-2023");
		date2.add("16-Aug-2023");
		date2.add("17-Aug-2023");
		date2.add("18-Aug-2023");
		date2.add("19-Aug-2023");
		date2.add("20-Aug-2023");
		date2.add("21-Aug-2023");
		date2.add("22-Aug-2023");
		date2.add("23-Aug-2023");
		date2.add("24-Aug-2023");
		date2.add("25-Aug-2023");
		date2.add("26-Aug-2023");
		date2.add("27-Aug-2023");
		date2.add("28-Aug-2023");
		date2.add("29-Aug-2023");
		date2.add("30-Aug-2023");
		date2.add("31-Aug-2023");

		
		
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
		
		for(int i=0;i<62;i++) {
			dt1=date2.get(i);
			opening1=principal1;
			if(dt1.equals(date1.get(pos))) {
				credit=credit1.get(pos);
				debit=debit1.get(pos);
				pos=pos+1;
			}
			else {
				credit=0;
				debit=0;
			}
			principal1=opening1+credit-debit;
			interest1=principal1*time1*rate1;
			interest.add(interest1);
			intTot=intTot+interest1;
			System.out.print(date2.get(i)+"  ");
			System.out.println(interest1);
			
		}
		System.out.println(intTot);

	}
}