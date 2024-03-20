package com.sangamone;

import java.util.HashMap;
import java.util.Map;

public class TestMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String>m1=new HashMap<>();
		System.out.println(m1.put(1, "Siva"));
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.entrySet());
		System.out.println(m1.containsKey(1));
		System.out.println(m1.containsValue("Siva"));
		System.out.println(m1.put(1, "Shankar"));
		System.out.println(m1);

	}

}
