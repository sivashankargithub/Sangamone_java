package com.sangamone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method_Rule3 {
	public static String rule3(List<String> used2) {
		List<String> used = new ArrayList<>();
		used=used2;
		Scanner sc1=new Scanner(System.in);
		String input1=sc1.nextLine();
		String temp1="";
		Boolean isdisqualified=false;
		int len1=used.size();
		
		for(int i=0; i<len1; i++) {
			temp1=used.get(i);
			if(input1.equals(temp1)) {
				System.out.println("Player is disqualified due to Rule3");
				isdisqualified=true;
				System.exit(0);
			}
		}
		System.out.println("Game can proceed");
		String res=input1+"\n "+isdisqualified;
		return(res);
		
		
	}


}
