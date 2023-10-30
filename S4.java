package com.sangamone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S4 {
	
	public static void convert(int num1) {
		List<Integer>numbers=new ArrayList<>();
		List<String>inwords=new ArrayList<>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		numbers.add(17);
		numbers.add(18);
		numbers.add(19);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		
		inwords.add("zero");
		inwords.add("one");
		inwords.add("two");
		inwords.add("three");
		inwords.add("four");
		inwords.add("five");
		inwords.add("six");
		inwords.add("seven");
		inwords.add("eight");
		inwords.add("nine");
		inwords.add("ten");
		inwords.add("eleven");
		inwords.add("twelve");
		inwords.add("thirteen");
		inwords.add("fourteen");
		inwords.add("fifteen");
		inwords.add("sixteen");
		inwords.add("seventeen");
		inwords.add("eighteen");
		inwords.add("nineteen");
		inwords.add("twenty");
		inwords.add("thirty");
		inwords.add("forty");
		inwords.add("fifty");
		inwords.add("sixty");
		inwords.add("seventy");
		inwords.add("eighty");
		inwords.add("ninety");
		
		int pos=numbers.indexOf(num1);
		String output=inwords.get(pos);
		System.out.print(output);
			System.out.print(" ");

	}
	
	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number between 21 to 99");
		int num1=sc1.nextInt();
		
		double temp=0.0;
		temp=num1/10.0;
		System.out.println(temp);
		int part1=((int)temp)*10;
		int part2=num1-part1;
		System.out.println(part1+" "+part2);
		
		convert(part1);
		convert(part2);
		sc1.close();
	}

}
