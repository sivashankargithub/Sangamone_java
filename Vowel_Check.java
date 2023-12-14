package com.sangamone;

import java.util.Scanner;

public class Vowel_Check {
	public static void vowel(String s1) {
		char[] arr1=new char[] {'a','e','i','o','u','A','E','I','O','U'};
		int count=0;
		for(int j=0;j<s1.length();j++) {
			for(int i=0;i<arr1.length;i++) {
				if(s1.charAt(j)==arr1[i]){
					System.out.print(s1.charAt(j)+" ");
					count++;
				}
			}
		}
		System.out.println("\nThe total number of wowels are : "+count);
	}

	public static void main(String[] args) {
		System.out.println("-------VOWEL CHECKER--------");
		Scanner sc1=new Scanner(System.in);
		System.out.println("Ente a word : ");
		String s1=sc1.nextLine();
		vowel(s1);
	}
}
