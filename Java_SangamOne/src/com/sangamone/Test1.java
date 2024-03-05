package com.sangamone;

public class Test1 {

	public static void main(String[] args) {
		String[] array1=new String[2];
		for(int i=0;i<4;i++) {
			String str="s,i,v,a";
			array1=str.split(",");
		}
		for(int i=0;i<3;i++) {
			System.out.println(array1[0]);
		}

	}

}
