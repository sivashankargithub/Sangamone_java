package com.sangamone.ternary;

public class Ternary {

	public static void main(String[] args) {
		//Apply for voter ID or not
		int age=18;
		String result="";
		result=(age>=18)?"you can apply for voterid":"you can't apply for voter id";
		System.out.println("You are "+age+" so "+result);
		
		//Leap year or not
		int year=1994;
		result=(year%4==0 && year%100!=0|| year%400==0)?"It is leap year":"Not a leap year";
		System.out.println(result);
		
		//greater number
		int num1=24;
		int num2=2;
		int result1;
		result1=num1>num2?num1:num2;
		System.out.println(result1+" is great");
		
		//boolean value
		int a=-1;
		boolean ss=false;
		ss=a<0?true:false;
		System.out.println(ss);
	}

}
