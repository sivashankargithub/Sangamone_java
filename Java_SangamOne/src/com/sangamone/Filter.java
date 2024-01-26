package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter {
	public static ArrayList<String> loadData(String fname) throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			list1.add(str1);
		}
		sc1.close();
		return list1;
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		list1=loadData("word.txt");
		list2=list1.stream().filter(words -> words.startsWith("b")).collect(Collectors.toList());
		System.out.println(list2);
	}

}
