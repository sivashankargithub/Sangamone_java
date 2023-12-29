package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class DM{
	private String english,telugu,kannada,spanish;
	
	public DM(String english, String telugu, String kannada, String spanish){
		this.english=english;
		this.telugu=telugu;
	    this.kannada=kannada;
	    this.spanish=spanish;
	}
	public String[] getDays() {
		String[] arr1=new String[4];
		arr1[0]=english;
		arr1[1]=telugu;
		arr1[2]=kannada;
		arr1[3]=spanish;
		return arr1;
	}
}
public class Days {
	public static void func1() throws FileNotFoundException {
		String fname="days_months.txt";
		ArrayList<DM>list1=new ArrayList<>();
		ArrayList<String>lang=new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		String[] arr1=null;
		String[] arr2=sc1.nextLine().split(",");
		for(int i=0;i<arr2.length;i++) {
			lang.add(arr2[i]);
		}
		System.out.println(lang);
		while(sc1.hasNextLine()) {
			String str1=sc1.nextLine();
			arr1=str1.split(",");
			list1.add(new DM(arr1[0],arr1[1],arr1[2],arr1[3]));
		}
		for(int i=0;i<lang.size();i++) {
			System.out.println(i+1+" "+lang.get(i));
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your language : ");
		int choice=sc.nextInt();
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i).getDays()[0]+"  :  "+list1.get(i).getDays()[choice-1]);	
		}
		sc1.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		func1();
		
	}

}
