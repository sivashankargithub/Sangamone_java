package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S9 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		List<String> list3=new ArrayList<>();//empty list
		List<List<String>> list4=new ArrayList<>();
		List<String>list5=new ArrayList<>();
		list5.add("a");
		list5.add("b");
		list5.add("c");
		list5.add("d");
		list5.add("e");
		list5.add("f");
		list5.add("g");
		list5.add("h");
		list5.add("i");
		list5.add("j");
		list5.add("k");
		list5.add("l");
		list5.add("m");
		list5.add("n");
		list5.add("o");
		list5.add("p");
		list5.add("q");
		list5.add("r");
		list5.add("s");
		list5.add("t");
		list5.add("u");
		list5.add("v");
		list5.add("w");
		list5.add("x");
		list5.add("y");
		list5.add("z");
		File f1=new File("word.txt");
		Scanner sc1 = new Scanner(f1);
		String temp1="";
		String word1="";
		String word2="";
		String s1="";
		while(sc1.hasNextLine()) {
			temp1=sc1.nextLine();
			list1.add(temp1);
		}
		int len1;
		
		for(int j=0;j<2;j++) {
			word2=list5.get(j);
			len1=list1.size();
			for(int i=0;i<len1;i++)
			{
				word1=list1.get(i);
				s1=word1.substring(0, 1);
				if(s1.equals(word2)) {
					list2.add(word1);
				}	
			}
			list4.add(list2);
			list2=list3;
			System.out.println(list4);
		}

	}

}
