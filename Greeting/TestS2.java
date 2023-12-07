package com.sangamone;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import com.sangamone.S2;

public class TestS2 {

	public static void main(String[] args) throws Exception{
		File f1=new File("greeting2.txt");
		ArrayList<String>name=new ArrayList<>();
		ArrayList<String>gender=new ArrayList<>();
		String[] arr1=null;
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			arr1=sc1.nextLine().split(",");
			name.add(arr1[0]);
			if(arr1.length>1) {
				gender.add(arr1[1]);
			}
		}
		System.out.println(name);
		//System.out.println(gender);
		S2 s2=new S2();
		for(int i=0;i<name.size();i++) {
			if(arr1.length<1) {
				System.out.println(s2.greeting());
			}
			if(arr1.length==1) {
				System.out.println(s2.greeting(name.get(i)));
			}
			if(arr1.length==2) {
				System.out.println(s2.greeting(name.get(i),gender.get(i)));
			}
			
		}
		
	}

}
