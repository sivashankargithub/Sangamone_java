package com.sangamone;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	public static int[] input() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Total number to compare : ");
		int tot=sc1.nextInt();
		int[] arr = new int[tot];
		System.out.println("Enter "+tot+" numbers");
		for(int i=0;i<arr.length;i++) {
			int num=sc1.nextInt();
			arr[i]=num;
		}
		return arr;
	}
	public static int second1(int[] arr) {
		Arrays.sort(arr);
		int len=arr.length;
		return arr[len-2];
	}
	public static void main(String[] args) {
		int[] arr=input();
		System.out.println(second1(arr)+" is the Second Largest number");
		
	}

}
