package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Titanic2 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>names = new ArrayList<>();
		List<Double>age = new ArrayList<>();
		List<String>gender = new ArrayList<>();
		List<Integer>sur_dis=new ArrayList<>();
		List<String>sur_child = new ArrayList<>();
		List<String>sur_men = new ArrayList<>();
		List<String>sur_women = new ArrayList<>();
		List<String>dis_child = new ArrayList<>();
		List<String>dis_men = new ArrayList<>();
		List<String>dis_women = new ArrayList<>();
		
		File f1=new File("Titanic.csv");
		boolean s2;
		String s1;
		String[] array1=null;
		Scanner sc1=new Scanner(f1);
		s1=sc1.nextLine();
		while(sc1.hasNextLine()) {
			array1=sc1.nextLine().split(",");
			sur_dis.add(Integer.parseInt(array1[1]));
			names.add(array1[4]);
			gender.add(array1[5]);
			s2=array1[6]==""?age.add(40.0):age.add(Double.parseDouble(array1[6]));
		}
		for(int i=0;i<names.size();i++) {
			s2=age.get(i)<10.0 && sur_dis.get(i)==1?sur_child.add(names.get(i)):false;
			s2=age.get(i)<10.0 && sur_dis.get(i)==0?dis_child.add(names.get(i)):false;
			s2=age.get(i)>10.0 && gender.get(i).equals("male") && sur_dis.get(i)==1?sur_men.add(names.get(i)):false;
			s2=age.get(i)>10.0 && gender.get(i).equals("female") && sur_dis.get(i)==1?sur_women.add(names.get(i)):false;
            s2=age.get(i)>10.0 && gender.get(i).equals("male") && sur_dis.get(i)==0?dis_men.add(names.get(i)):false;
			s2=age.get(i)>10.0 && gender.get(i).equals("female") && sur_dis.get(i)==0?dis_women.add(names.get(i)):false;
		}
		int len1,len2,len3,len4,len5,len6;
		
		len1=sur_child.size();
		len2=sur_men.size();
		len3=sur_women.size();
		len4=dis_child.size();
		len5=dis_men.size();
		len6=dis_women.size();
		
		int tot_sur=len1+len2+len3;//Survived
		int tot_non=len3+len4+len5;//Non_Survived
		
		System.out.println("Survived");
		System.out.println();
		System.out.println("Total Survived Children are : "+len1);
		System.out.println();
		System.out.println("Total Survived Men are : "+len2);
		System.out.println();
		System.out.println("Total Survived Women are : "+len3);
		System.out.println();
		System.out.println("Total Survived people: "+tot_sur);
		System.out.println();
		
		System.out.println("Non-Survived");
		System.out.println("Total Non-Survived Children are: "+len4);
		System.out.println();
		System.out.println("Total Non-Survived Men are : "+len5);
		System.out.println();
		System.out.println("Total Non-Survived Women are : "+len6);
		System.out.println();
		
		System.out.println("Total Non-Survived people are : "+tot_non);
	}

}
