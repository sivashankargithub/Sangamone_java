package com.sangamone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		List<Integer>list1 = new ArrayList<>();
		list1.add(10);
		list1.add(10);
		list1.add(13);
		list1.add(32);
		list1.add(154);
		list1.add(90);
		int min=list1.stream().min(Integer::compareTo).get();
		int max=list1.stream().max(Integer::compareTo).get();
		Collections.swap(list1, 1, 4);
		System.out.println("Minimum value : "+min);
		System.out.println("Maximum Value : "+max);
		System.out.println(list1);
		System.out.println(System.getProperty("java.version"));
		
		System.out.println(list1.retainAll(list1));
	}

}
