package com.sangamone;

import java.util.List;
import java.util.ArrayList;

public class S10 {
	public static void main(String[] args) {
		List<String>used=new ArrayList<>();
		used.add("apple");
		used.add("banana");
		used.add("carrot");
		used.add("drumstick");
		used.add("egg");
		used.add("fish");
		Method_Rule3 obj1=new Method_Rule3();
		String result=obj1.rule3(used);

		System.out.println("Player has entered the word "+result);

	}

}