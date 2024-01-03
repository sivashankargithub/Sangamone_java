package com.sangamone.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holidays2 {
	@GetMapping("getHolidaysAll")
	public List<String> holiAll() throws Exception{
		ArrayList<String>holiList=new ArrayList<>();
		String filename1="input2024.txt";
		File f1=new File(filename1);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			holiList.add(str1);
		}
		return holiList;
	}
	
	@GetMapping("getHolidaysByYear2/{year}")
	public List<String> holiByYear(@PathVariable String year) throws Exception{
		List<String>list1=new ArrayList<>();
		List<String>getHoli=new ArrayList<>();
		List<String>y1=new ArrayList<>();
		Holidays2 holidays2=new Holidays2();
		list1=holidays2.holiAll();
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
	@GetMapping("getHolidaysByMonthStr/{month}")
	public List<String> monthString(@PathVariable String month) throws Exception{
		List<String>list1=new ArrayList<>();
		List<String>getHoli=new ArrayList<>();
		List<String>y1=new ArrayList<>();
		Holidays2 holidays2=new Holidays2();
		list1=holidays2.holiAll();
		for(int i=0;i<list1.size();i++) {
			String str=list1.get(i);
			String[] arr1=str.split("-");
			y1.add(arr1[1]);
		}
		for(int i=0;i<list1.size();i++) {
			String str1=y1.get(i);
			String str2=str1.substring(0,3);
			if(month.equalsIgnoreCase(str1)||month.equalsIgnoreCase(str2)) {
				getHoli.add(list1.get(i));
			}
		}
		return getHoli;
	}
	@GetMapping("getHolidaysByMonthNum/{month}")
	public List<String> monthInt(@PathVariable String month) throws Exception{
		List<String>mlist1=new ArrayList<>();
		List<String>mlist2=new ArrayList<>();
		File f1=new File("months.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1=sc1.nextLine().split(",");
			mlist1.add(arr1[0]);
			mlist2.add(arr1[1]);
		}
		
		List<String>list1=new ArrayList<>();
		List<String>holiMonth=new ArrayList<>();
		Holidays2 holidays2=new Holidays2();
		list1=holidays2.holiAll();
		for(int i=0;i<list1.size();i++) {
			String str1=list1.get(i);
			String[] arr1=str1.split("-");
			holiMonth.add(arr1[1]);
		}
		
		List<String>monthList=new ArrayList<>();
		for(int j=0;j<holiMonth.size();j++) {
			for(int i=0;i<mlist1.size();i++) {
				if(holiMonth.get(j).equals(mlist1.get(i))) {
					monthList.add(mlist2.get(i));
				}
			}
		}
		
		List<String>result=new ArrayList<>();
		for(int i=0;i<monthList.size();i++) {
			if(month.equalsIgnoreCase(monthList.get(i))) {
				result.add(list1.get(i));
			}
		}
		return result;	
	}
	
	@GetMapping("getHolidaysByMonth2/{month}")
	public List<String> HoliByMonth(@PathVariable String month) throws Exception{
		List<String>mlist1=new ArrayList<>();
		List<String>mlist2=new ArrayList<>();
		File f1=new File("months.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1=sc1.nextLine().split(",");
			mlist1.add(arr1[0]);
			mlist2.add(arr1[1]);
		}
		List<String>result=new ArrayList<>();
		for(int i=0;i<mlist1.size();i++) {
			String str1= mlist1.get(i);
			String str2=str1.substring(0, 3);
			String str3=mlist2.get(i);
			if(month.equalsIgnoreCase(str1)||month.equalsIgnoreCase(str2)) {
				Holidays2 holidays2=new Holidays2();
				result=holidays2.monthString(month);
			}
			else if(month.equalsIgnoreCase(str3)) {
				Holidays2 holidays2=new Holidays2();
				result=holidays2.monthInt(month);
			}
		}
		return result;
	}
	
	@GetMapping("getHolidayFuture")
	public String holiFuture() throws Exception{
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String today =LocalDate.now().format(dtf1);
		List<String>list1=new ArrayList<>();
		Holidays2 holidays2=new Holidays2();
		holidays2.holiAll();
		int num=0;
		for(int i=0;i<list1.size();i++) {
			if(today.equals(list1.get(i))) {
				num=i;
			}
		}
		return today;
	}
}
