package com.sangamone;

import java.util.Arrays;
import java.util.List;

public class ExampleLambda {

	public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(2,55,98,96,54,77,234,654);
		System.out.println(list1.stream());
		list1.forEach(num -> {
			if(num%2==0) {
				System.out.println("Even Number: "+num);
			}
			if(num%2!=0) {
				System.out.println("Odd Number: "+num);
			}
		});
		System.out.println();
		System.out.println("String Lambda");
		
		List<String>list2=Arrays.asList("Sivashanar","Sivakumar","Sivaraj","Lalu Prasad","Prajwal","CS","Ananya","Misbah");
		list2.forEach(name -> {
			if(name.contains("Siva")) {
				System.out.println(name);
			}
		});
		
	}

}
