package com.sangamone;

public class S6 {

	public static void main(String[] args) {
		String rev1="CS Sir";
		StringBuilder sb1=new StringBuilder();
		sb1.append(rev1);
		System.out.println(sb1);
		System.out.println();
		sb1.reverse();
		System.out.println("Reversed String : "+sb1);
		char char1=sb1.charAt(0);
		System.out.println();
		//getting single charecter
		System.out.println(char1);
		System.out.println();

	}

}
