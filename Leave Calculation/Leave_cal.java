package com.sangamone;

import java.io.*;
import java.util.*;

public class Leave_cal {

	public static void main(String[] args) throws FileNotFoundException {
		String[] list1 = null;
		int total;
		List<String>names1=new ArrayList<>();
		List<String>names2=new ArrayList<>();
		List<String>country=new ArrayList<>();
		List<String>from_date=new ArrayList<>();
		List<String>to_date=new ArrayList<>();
		List<Integer>duration=new ArrayList<>();
		List<String>leave_type=new ArrayList<>();
		
		File f1=new File("Leave1.csv");
		Scanner sc=new Scanner(f1);
		String info1=sc.nextLine();
		for(int i=0;i<42;i++) {
			list1=sc.nextLine().split(",");
			names1.add(list1[1]);
			country.add(list1[3]);
			from_date.add(list1[4]);
			to_date.add(list1[5]);
			duration.add(Integer.parseInt(list1[6]));
			leave_type.add(list1[7]);
		}
		Set<String>set1=new LinkedHashSet<>(names1);
		names2.addAll(set1);
		List<String>names_us1=new ArrayList<>();
		
		for(int i=0;i<=names1.size()-1;i++) {
			if(country.get(i).equals("US")) {
				names_us1.add(names1.get(i));
			}
		}
		Set<String>set2=new LinkedHashSet<>(names_us1);
		List<String>names_us2=new ArrayList<>();
		names_us2.addAll(set2);
		
		System.out.println("---------US Dashboard---------");
		
		for(int j=0;j<names_us2.size();j++) {
			total=0;
			for(int i=0;i<names1.size()-1;i++) {
				if(names1.get(i).equals(names_us2.get(j))) {
					total=total+duration.get(i);
					System.out.println(from_date.get(i)+" "+to_date.get(i)+" "+duration.get(i)+" "+leave_type.get(i));
				}
			}
			System.out.println(names_us2.get(j)+" has taken a total of "+total+" leaves");
		}
		
	}

}
