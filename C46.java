package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Convert1 {
	public static String convert1000(int num1, ArrayList<String> list1){
	      
		return null;
	}
	public static String convert100(int num1, ArrayList<String> list1) {
		ArrayList<String>list2=new ArrayList<>();
		int part1=0,part2=0,part3=0;
		String word1="";
		if(num1<=20) {
			word1=list1.get(num1);
			return word1;
		}
		else if(num1<=100) {
			part1 = (num1/10)-2;//num1=42=2
			part2=num1%10;//40%10=
			int position=20+part1;
			return list1.get(position)+" "+list1.get(part2);
		}
		else if(num1>100 && num1<=1000) {
			//int part1=0,part2=0,part3=0;
			//String word1;//  
			part1=num1/100;  //900/100=9  nine hundred and two
			part2=(num1/num1)*100; //900/900=1*100=100
			part3=num1%100;//900/100  =0 nine hundred
			word1=part3==0?convert100(part1, list1)+" "+convert100(part2,list1):convert100(part1, list1)+" "+convert100(part2,list1)+"And "+convert100(part3, list1);
			word1=num1==1000?list1.get(29):word1;
			return word1;
			
		}
		else if(num1>1000&&num1<2000) {
			part1=(num1/1000);
			part2=num1/part1;
			return convert100(part1,list1)+" "+convert100(part2,list1);
		}
		else {
			
			return null;
		}
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
		System.out.println(list1);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num1=sc1.nextInt();
		System.out.println(convert100(num1, list1));
	}
}
