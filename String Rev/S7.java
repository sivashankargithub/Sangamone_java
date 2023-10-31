package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S7 {
	public static void reverse() throws FileNotFoundException {
		String file_inname1="names.txt";
		int len1=file_inname1.length();
		int len2;
		String file_inname2=file_inname1.substring(0, len1-4);
		String file_outname=file_inname2+"out_"+"06:00"+".txt";
		System.out.println(file_outname);
		File f1=new File("names.txt");
		Scanner sc1=new Scanner(f1);
		String  fileinfo="";
		List<String>names1=new ArrayList<>();
		List<String>rev_names1=new ArrayList<>();
		while(sc1.hasNextLine()) {
			fileinfo=sc1.nextLine();
			names1.add(fileinfo);
		}
		String rev1="";
		String str1="";
		String rev2="";
		System.out.println(names1);
		for(int j=0;j<names1.size();j++) {
			str1=names1.get(j);
			len2=str1.length();
			for(int i=0;i<len2;i++) {
				rev1=str1.substring(len2-i-1,len2-i);
				rev2=rev2+rev1;
			}
			System.out.println(rev2);
			rev_names1.add(rev2);
		}
		System.out.println(rev_names1);
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		reverse();
	}
}
