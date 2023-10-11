package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class Duplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		List<Integer> list1=new ArrayList<>();
		List<Integer>list3=new ArrayList<>();
		
		
		list1.add(2);
		list1.add(10);
		list1.add(10);
	
		num1=list1.get(0);//2,
		list3.add(num1);//[2]
		
		num1=list1.get(1);//10
		if(num1==list3.get(0)) {
		}
		else {
			list3.add(num1);//[2,10]
		}
		num1=list1.get(2);//10
		if(num1==list3.get(0)) {
		}
		else {
			if(num1==list3.get(1)) {	
			}
			else {
				list3.add(num1);
			}
		}
		
		
		
		for(int i=0;i<list3.size();i++) {
			System.out.println(list3.get(i));
		}

	}

}
