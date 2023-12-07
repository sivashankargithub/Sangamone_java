package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import com.sangamone.Greeting;

public class TestGreeting {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("greeting0.txt");
		ArrayList<String>name=new ArrayList<>();
		ArrayList<String>gender=new ArrayList<>();
		String[] arr1=null;
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			arr1=sc1.nextLine().split(",");
			if(arr1[0].equals("Male")||arr1[0].equals("Female")||arr1[0].equals("M")||arr1[0].equals("F")||arr1[0].equals("m")||arr1[0].equals("f")||arr1[0].equals("MALE")||arr1[0].equals("FEMALE")||arr1[0].equals("male")||arr1[0].equals("female")){
				name.add(arr1[1]);
				gender.add(arr1[0]);
			}
			else {
				name.add(arr1[0]);
				gender.add(arr1[1]);
			}
			
		}
		System.out.println(name);
		System.out.println(gender);
		Greeting greeting = new Greeting();
		for(int i=0;i<name.size();i++) {
			if(name.get(i).equals("")) {
				System.out.println(greeting.greeting());
			}
			if(gender.get(i).equals(" ")||gender.get(i).equals("-1")||gender.get(i).equals("1")){
				System.out.println(greeting.greeting(name.get(i)));
			}
			else {
				System.out.println(greeting.greeting(name.get(i),gender.get(i)));
			}
		}
		
	}
}
