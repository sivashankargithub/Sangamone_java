package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>words1=new ArrayList<>();
		String file_info;
		File f1=new File("word.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			file_info=sc1.nextLine();
			words1.add(file_info);
		}
		System.out.println(words1);
		Scanner sc2=new Scanner(System.in);
		
		int len1;
		int len2;
		char first_letter;
		char last_letter;
		String temp1="";
		
		System.out.println("Enter any English word: ");
		String input=sc2.next();
		len1=input.length();
		last_letter=input.charAt(len1-1);
		System.out.println(last_letter);
		len2=words1.size();
		
		for(int i=0;i<len2;i++) {
			temp1=words1.get(i);
		    first_letter=temp1.charAt(0);
		    if(last_letter==(first_letter)) {
			System.out.println(temp1);
			break;
		    }
	   }
    }
}