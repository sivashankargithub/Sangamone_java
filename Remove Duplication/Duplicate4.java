package com.sangamone;

import java.util.*;
import java.util.List;

public class Duplicate4 {
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
		Set<Integer> set1=new HashSet<>(list1);
		list2.addAll(set1);
		
		return list2;
	}
}