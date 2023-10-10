package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
	public static void main(String args[]) throws FileNotFoundException {
		List<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		File f1=new File("data.txt");
		Scanner sc = new Scanner(f1);
		while(sc.hasNextLine()) {
			String info1=sc.nextLine();
			String[] words=info1.split(" ");
			for(String word : words) {
				list1.add(word);
			}
		}
		//list2.add(list1.get(0));
		//Collections.sort(list1);
		System.out.println(list1);
		for(String ele :list1) {
			if(!list2.contains(ele)) {
				list2.add(ele);
			}
		}
		System.out.println(list2);
		list2.sort(null);
		//Collections.sort(list2);
		System.out.println(list2);
		sc.close();
	}
}