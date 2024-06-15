package com.sangamone;

public class Table1 {
	public static void getTables(int start,int end) {
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				System.out.println(j + "*" + i + "=" + j*i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int start=3;
		int end=20;
		getTables(start,end);
	}
	

}
