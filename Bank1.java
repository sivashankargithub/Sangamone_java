package com.sangamone;
import java.util.*;

public class Bank1 {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<>();//name
		list1.add("01-Jul-2023");
		list1.add("05-Jul-2023");
		list1.add("10-Jul-2023");
		list1.add("12-Jul-2023");
		list1.add("20-Jul-2023");
		list1.add("25-Jul-2023");
		list1.add("28-Jul-2023");
		list1.add("29-Jul-2023");
		list1.add("30-Jul-2023");
		
		int ca=20000;
		
		List<Integer>list2=new ArrayList<>();
		list2.add(5333);
		list2.add(7500);
		list2.add(2000);
		list2.add(800);
		list2.add(400);
		list2.add(300);
		list2.add(750);
		list2.add(1000);
		
		
		
		List<String>list6=new ArrayList<>();//bank1
		double t=1/365;
		double r=5/100;
		double interest=ca*t*r;
		System.out.println(interest);
		
		List<String>list7=new ArrayList<>();//bank2
		
		
	}

}
