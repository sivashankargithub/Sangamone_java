package com.sangamone;

import java.util.Random;

public class Rand1 {

	public static void main(String[] args) {
		Random rand1=new Random();
		String otp="";
		int rn=0;
		for(int i=0;i<6;i++) {
			rn=rand1.nextInt(9);
			otp=otp+rn;
		}
		
		System.out.println(otp);

	}

}
