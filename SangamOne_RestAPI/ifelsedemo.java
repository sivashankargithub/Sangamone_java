package ConditionalStatement;

import java.util.Scanner;

public class ifelsedemo {
	public static void main(String args[]) {
		int number;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to check odd or even");
		number = s.nextInt();
		
		if(number%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
