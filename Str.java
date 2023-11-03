package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class Str {
	public static List<String> perm1(String word1){
		List<String>word2 = new ArrayList<>();
		String s1,s2,s3;
		for(int i=0;i<3;i++) {
			
		}
		s1=word1.substring(0,1);
		s2=word1.substring(1,2);
		s3=word1.substring(2,3);
		word2.add(s1+s2+s3);
		word2.add(s1+s3+s2);
		word2.add(s2+s1+s3);
		word2.add(s2+s3+s1);
		word2.add(s3+s1+s2);
		word2.add(s3+s2+s1);
		
		return word2;
	}

	public static void main(String[] args) {
		
		String word1="GOD";
		System.out.println(perm1(word1));
		
		String word2="EAST";
		String s1,s2,s3,s4;
	}

}
