package com.sangamone;

import java.util.ArrayList;

public class Ascii1 {
	public static void main(String[] args) {
		char a='a';
		String b=String.valueOf(a);
		System.out.println(b);
		ArrayList<String>list1=new ArrayList<>();
		ArrayList<String>list2=new ArrayList<>();
		for(char i='A';i<='Z';i++) {
			list1.add(String.valueOf(i));
		}
		System.out.println(list1);
		
		for(int i=1;i<26;i++) {
			if(i<10) {
				list2.add("0"+String.valueOf(i));
			}
			else {
				list2.add(String.valueOf(i));
			}
		}
		System.out.println(list2);
	}
}
