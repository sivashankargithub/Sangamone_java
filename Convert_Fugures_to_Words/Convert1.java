package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Convert1 {
	public static String convertcore2(long num1, ArrayList<String> list1){
		long part1=0;
		part1=num1%100000;
		
		if(part1<=20) {
			return convertcore(num1, list1)+" "+convert20(part1, list1);
		}
		else if(part1<=100) {
			return convertcore(num1, list1)+" "+convert100(part1, list1);
		}
		else if(part1<=1000){
			return convertcore(num1, list1)+" "+convert1000(part1, list1);
		}
		else{
			return convertcore(num1, list1)+" "+convertlakh(part1, list1);
		}
		
	}
	
	public static String convertcore(long num1, ArrayList<String> list1){
		long part1=0;
		if(num1<10000000) {
			part1=num1/100000;
			if (part1<=20) {
				return convert20(part1,list1)+" "+list1.get(30);
			}
			else if (part1<=100) {
				return convert100(part1,list1)+" "+list1.get(30);
			}
		}
		else {
			part1=num1/10000000;
			if (part1<=20) {
				return convert20(part1,list1)+" "+list1.get(31);
			}
			else if (part1<=100) {
				return convert100(part1,list1)+" "+list1.get(31);
			}
		}
		return "It will work up to 100 crore";
	}
	public static String convertlakh(long num1, ArrayList<String> list1){
		long part1=0,part2=0,part3=0;
		part1=(num1/1000);
		part2=(num1/num1)*1000;
		part3=(num1%1000);
		
		if(num1<=20000) {
			if(part3<=20) {
				return convert20(part1,list1)+" "+convert1000(part2,list1)+" "+convert20(part3,list1);
			}
			else if(part3<=20) {
				return convert20(part1,list1)+" "+convert1000(part2,list1)+" "+convert100(part3,list1);
			}
			else {
				return convert20(part1,list1)+" "+convert1000(part2,list1)+" "+convert1000(part3,list1);
			}
			
		}
		else{
			
			if(part3<=20) {
				return convert100(part1,list1)+" "+convert1000(part2,list1)+" "+convert20(part3,list1);
			}
			else if(part3<=20) {
				return convert100(part1,list1)+" "+convert1000(part2,list1)+" "+convert100(part3,list1);
			}
			else {
				return convert100(part1,list1)+" "+convert1000(part2,list1)+" "+convert1000(part3,list1);
			}
		}
	}
	
	public static String convert1000(long num1, ArrayList<String> list1){
		long part1=0,part2=0,part3=0;
		String word1="";
		part1=num1/100;  //101/100=1  nine hundred and two
		part2=(num1/num1)*100; //101/101=1*100=100
		part3=num1%100;//900/100  =0 nine hundred
		if(part3<=20) {
			word1=part3==0?convert20(part1, list1)+" "+convert100(part2,list1):convert20(part1, list1)+" "+convert100(part2,list1)+"And "+convert20(part3, list1);
		}
		else {
			word1=convert20(part1, list1)+" "+convert100(part2,list1)+"And "+convert100(part3, list1);
		}		
		word1=num1==1000?list1.get(29):word1;
		return word1;
	}
	public static String convert100(long num1, ArrayList<String> list1) {
		long part1=0,part2=0,part3=0;
		String word1="";
		part1 = (num1/10)-2;//num1=42=2
		part2=num1%10;//40%10=
		int position=(int) (20+part1);
		return list1.get(position)+" "+list1.get((int) part2);
		
	}
	public static String convert20(long num1, ArrayList<String> list1) {
		long part1=0,part2=0,part3=0;
		String word1="";
		word1=list1.get((int) num1);
		return word1;
//		else if(num1>1000&&num1<2000) {
//			part1=(num1/1000);
//			part2=num1/part1;
//			return convert100(part1,list1)+" "+convert100(part2,list1);
//		}
		
	}
	public static ArrayList<String> fileRead(ArrayList<String> list1) throws Exception{
		File f1=new File("words_input.txt");
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}

	public static void main(String[] args) throws Exception {
		ArrayList<String>list1=new ArrayList<>();
		list1=fileRead(list1);
		int i=0;
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter a number to convert : ");
		String input=sc1.nextLine();
		System.out.println();
		while(!input.equalsIgnoreCase("exit")) {
			try {
				Long num1=Long.parseLong(input);
				if(num1<=20) {
					System.out.println(num1+" : "+convert20(num1, list1));
				}
				else if(num1<=100) {
					System.out.println(num1+" : "+convert100(num1, list1));
				}
				else if(num1<=1000){
					System.out.println(num1+" : "+convert1000(num1, list1));
				}
				else if(num1<100000) {
					System.out.println(num1+" : "+convertlakh(num1, list1));
				}
				else if(num1<=1000000000) {
					System.out.println(num1+" : "+convertcore2(num1, list1));
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid input. Please enter Numeric value:");	
			}
			System.out.println();
			System.out.print("Enter a number to convert or Enter (exit) to quit : ");
			input=sc1.nextLine();
		}
		
		System.out.print("Thank you! The program is closing.....");
		
		
	}
}