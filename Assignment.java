package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Assignment {
	public static void main(String args[]) throws FileNotFoundException {
		List<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		List<String>list3=new ArrayList<>();
		String info1="";
		File f1=new File("data.txt");
		Scanner sc = new Scanner(f1);
		while(sc.hasNextLine()) {
			list1.add(sc.nextLine());
		}
		System.out.println(list1);
		System.out.println();
		list2.add(list1.get(0));
		System.out.println(list2);
		for(int i=1;i<list1.size();i++) {
			list3.add(list2.get(0)+" "+list1.get(i));
		}
		System.out.println(list3);
		System.out.println();
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println();
		System.out.println(list1);
	}
}