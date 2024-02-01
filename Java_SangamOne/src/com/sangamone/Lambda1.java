package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lambda1 {

	public static void main(String[] args)throws Exception {
		List<String>list1=new ArrayList<>();
		File f1=new File("words.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		System.out.println(list1);
		
		List<String>list2=new ArrayList<>();
		list2=list1.stream().filter(word -> word.startsWith("ma")).collect(Collectors.toList());
		System.out.println(list2);
		char aa='\u0905';
		System.out.println('\u2666');

	}
}
