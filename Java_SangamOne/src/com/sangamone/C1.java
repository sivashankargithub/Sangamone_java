package com.sangamone;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		System.out.println(Colors.PINK.ordinal());
		System.out.println(Colors.BLACK.getCode());
		System.out.println(Colors.BLUE.getCode());
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter color to get code :");
		String color=sc1.next();
		System.out.println(Colors.valueOf(color).getCode());
		
	}

}
