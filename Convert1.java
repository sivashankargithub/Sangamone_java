package com.restpkg1.rest1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import com.google.common.primitives.Ints;

public class Convert1 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		
		//Using IntStream
		List<Integer>list1=IntStream.of(arr1).boxed().toList();
		System.out.println(list1);
		
		
		//Using Guava Library. Guava library supports Ints class
		List<Integer>list2=Ints.asList(arr1);
		System.out.println(list2);
		
		//using Wrapper class
		Integer[] arr2= {1,2,3,4,5};
		List<Integer>list3=Arrays.asList(arr2);
		System.out.println(list3);
	}

}
