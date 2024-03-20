package com.sangamone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class SalaryLambda {

	public static void main(String[] args) {
		//Finding second highest salary in a team
		List<Integer>list1=Arrays.asList(25000,29000,32000,60000,50000,1500);
		List<Integer>list2=list1.stream().sorted((s1,s2) -> s2.sum(s1, s2)).collect(Collectors.toList());
		try {
			System.out.println(list2.get(1));
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println(ie);
		}
		finally {
			System.out.println("There is only one data in the list");
		}
	}

}
