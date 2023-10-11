package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class Duplicate3 {
	public static void main(String[] args) {
		System.out.println(duplicate1());
	}
	public static List<Integer> duplicate1()
	{
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(4);
		list1.add(2);
		list1.add(4);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		
		list2.addAll(list1);
		for(int i=0;i<list2.size();i++) {
			
			for(int j=i+1;j<list2.size();j++) {
				if(list2.get(i)==list2.get(j)) {
					list2.remove(j);
				}
			}
		}
		return list2;
	}
}