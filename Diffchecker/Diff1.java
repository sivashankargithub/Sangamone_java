package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;

public class Diff1 {
	public static List<Integer> diff1(String fname1, String fname2) throws FileNotFoundException{
		List<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		List<String>difflines1= new ArrayList<>();
		List<String>difflines2=new ArrayList<>();
		List<Integer>lineno=new ArrayList<Integer>();
		File f1=new File(fname1);
		File f2=new File(fname2);
		Scanner sc1=new Scanner(f1);
		Scanner sc2=new Scanner(f2);
		String[] line1=null;
		String[] line2=null;
		int len1=0,len2=0,difflinecount=0;
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
		}
		while(sc2.hasNextLine()) {
			list2.add(sc2.nextLine());
		}
		len1=list1.size();
		for(int i=0;i<len1;i++) {
			if(!list1.get(i).equals(list2.get(i))) {
				lineno.add(i);
				difflines1.add(list1.get(i));
				difflines2.add(list2.get(i));
		}
		}
		difflinecount=difflines1.size();
		for(int j=0;j<difflinecount;j++) {
			line1=difflines1.get(j).split(" ");
			line2=difflines2.get(j).split(" ");
			len2=line1.length;
			for(int i=0;i<len2;i++) {
				if(!line1[i].equals(line2[i])) {
					System.out.println(line1[i]+" - "+line2[i]);
				}
			}
		}
		
		
		
		return lineno;
	}

	public static void main(String[] args) throws FileNotFoundException{
		List<Integer>lineno=new ArrayList<Integer>();
		lineno=diff1("file1.txt","file2.txt");
		System.out.println(lineno);
		
		
		
	}

}
