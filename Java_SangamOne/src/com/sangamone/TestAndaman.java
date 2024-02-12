package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class TestAndaman {

	public static void main(String[] args) {
		int count=100;
		String[] prison=new String[count];
		List<Integer>lucky=new ArrayList<>();
		List<Integer>unlucky=new ArrayList<>();
		for(int i=0;i<count;i++) {
			prison[i]="C";
		}		
		
		for(int i=0;i<count;i++) {
			prison[i]="O";
		}
		
		for(int i=1;i<count;i+=2) {
			prison[i]="C";
		}
		
		for(int j=2;j<count;j++) {
			for(int i=j;i<count;i+=j+1) {
				if(prison[i].equals("O")) {
					prison[i]="C";
				}
				else {
					prison[i]="O";
				}
			}
		}
		for(int i=0;i<count;i++) {
			if(prison[i].equals("O")) {
				lucky.add(i+1);
			}
			else {
				unlucky.add(i+1);
			}
		}
		System.out.println(lucky+" are lucky prisoners who are relesing today");
			System.out.println(unlucky+" are unlucky prisoners who will relese after 4 weeks");
	}

}
