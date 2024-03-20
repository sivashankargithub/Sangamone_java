package com.sangamone;

import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static int m1() {
		System.out.println("--------Welcome to Dividing Game--------");
		int a=m2();
		return a;
	}

	private static int m2() {
		int n1,n2,result;
		Scanner sc1=new Scanner(System.in);
		try{
			System.out.println("Enter 2 number to divide : ");
			n1=sc1.nextInt();
			n2=sc1.nextInt();
			result=n1/n2;
			return result;
		}
		catch(InputMismatchException ime) {
			System.out.println("Hey bro Number can't be a charecter or decimal\n"+ime);
		}
		catch(ArithmeticException ae) {
			System.out.println("Hello dude any number divide by zero is infinity\n"+ae);
			
		}
		finally {
			System.out.println("Bye Dear, Happy Journey. Just chill.");
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("By the way your Answer is: "+m1());
	}

}
