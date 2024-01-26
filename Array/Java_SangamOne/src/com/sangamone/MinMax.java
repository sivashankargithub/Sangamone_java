package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		List<Integer>list1 = new ArrayList<>();
		List<Integer>list2 = new ArrayList<>();
		list1.add(10);
		list1.add(13);
		list1.add(32);
		list1.add(154);
		list1.add(90);
		String s=list1.stream().min(Integer::compareTo);
		System.out.println(s);

	}

}
