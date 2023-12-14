package com.sangamone;


public class CharDuplicateRevove {

	public static void main(String[] args) {
		String s1="hello";
		char[] c1=s1.toCharArray();
		if(c1[0]==c1[0]) {
			System.out.println(c1[1]);
		}
		else {
			System.out.println("no duplicate");
		}

	}

}
