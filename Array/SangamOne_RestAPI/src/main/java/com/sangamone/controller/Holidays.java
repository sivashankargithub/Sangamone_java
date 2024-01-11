package com.sangamone.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holidays {
	@GetMapping("/totalHolidays")
	public List<String> holi() throws Exception{
		List<String>list1=new ArrayList<>();
		File f1=new File("input2024.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		sc1.close();
		return list1;
	}
	
	@GetMapping("/getHolidaysByYear/{year}")
	public List<String> holiByMonth(@PathVariable String year) throws Exception{
		List<String>list1=new ArrayList<>();
		List<String>getHoli=new ArrayList<>();
		List<String>y1=new ArrayList<>();
		Holidays holidays=new Holidays();
		list1=holidays.holi();
		for(int i=0;i<list1.size();i++) {
			String str=list1.get(i);
			String[] arr1=str.split("-");
			y1.add(arr1[2]);
		}
		for(int i=0;i<list1.size();i++) {
			if(year.equals(y1.get(i))) {
				getHoli.add(list1.get(i));
			}
		}
		
		return getHoli;
	}
	
	@GetMapping("/getHolidaysByMonth/{month}")
	public List<String> holiByYear(@PathVariable int month) throws Exception{
		List<String>mlist1=new ArrayList<>();
		List<Integer>mlist2=new ArrayList<>();
		File f1=new File("months.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1=sc1.nextLine().split(",");
			mlist1.add(arr1[0]);
			mlist2.add(Integer.parseInt(arr1[1]));
		}
		List<String>list1=new ArrayList<>();
		List<String>getHoli=new ArrayList<>();
		List<String>month1=new ArrayList<>();
		Holidays holiday2=new Holidays();
		list1=holiday2.holi();
		for(int i=0;i<list1.size();i++) {
			String str=list1.get(i);
			String[] arr1=str.split("-");
			month1.add(arr1[1]);
		}
		List<Integer>getlist1=new ArrayList<>();
		for(int j=0;j<month1.size();j++) {
			for(int i=0;i<mlist1.size();i++) {
				if(month1.get(j).equalsIgnoreCase(mlist1.get(i))) {
					getlist1.add(mlist2.get(i));
				}
			}
		}
		for(int i=0;i<list1.size();i++) {
			if(month==getlist1.get(i)) {
				getHoli.add(list1.get(i));
			}
		}
		return getHoli;
	}

}
