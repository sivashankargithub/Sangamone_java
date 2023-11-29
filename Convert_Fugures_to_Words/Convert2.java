package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Convert2 {
	public static String convertLakh(int num1, ArrayList<String> list1){
		int part1=0,part2=0,part3=0;
		String word1="";
		
		return word1;
		
	}
	public static String convert1000(int num1, ArrayList<String> list1) {
		int part1=0,part2=0,part3=0;
		String word1;//  
		part1=num1/100;
		part2=(num1/num1)*100; 
		part3=num1%100;
		if(part1>1) {
			word1=part3==0?convert100(part1, list1)+" "+convert100(part2,list1)+"లు":convert100(part1, list1)+" "+convert100(part2,list1)+"ల "+convert100(part3, list1);
		}
		else {
			word1=part3==0?convert100(part2,list1):"నూట "+convert100(part3, list1);
		}
		return word1;
	}
	public static String convert100(int num1, ArrayList<String> list1) {
		int part1=0,part2=0;
		String word1="";
		if(num1<=20) {
			word1=list1.get(num1);
			return word1;
		}
		if(num1<=100) {
			part1 = (num1/10)-2;
			part2=num1%10;
			word1=list1.get(20+part1)+""+list1.get(part2);
			return word1;
		}
		if(num1>100 && num1<1000) {
			word1=convert1000(num1, list1);
			return word1;
		}
		else {
			return null;
		}
	}
	public static ArrayList<String> fileRead(ArrayList<String> list1) throws Exception{
		File f1=new File("telugu_numbers.txt");
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("--------It will work upto Thousand---------");
		System.out.println("--------ఇది వెయ్యి వరకు మాత్రమే పని చేస్తుంది---------\n");
		ArrayList<String>list1=new ArrayList<>();
		list1=fileRead(list1);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter any number ");
		System.out.print("ఏదైనా సంఖ్యను నమోదు చేయండి : ");
		int num1=sc1.nextInt();
		System.out.print("The number in Telugu   : "+convert100(num1, list1));
	}
}