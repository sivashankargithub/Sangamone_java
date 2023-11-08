package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ticket2 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>names=new ArrayList<>();
		List<String>holidays=new ArrayList<>();
		List<Integer>year=new ArrayList<>();
		List<Integer>month=new ArrayList<>();
		List<Integer>date=new ArrayList<>();
		List<Integer>hour=new ArrayList<>();
		List<Integer>min=new ArrayList<>();
		List<Integer>sec=new ArrayList<>();
		String[] a1;
		File f1=new File("ndob.txt");
		Scanner sc1=new Scanner(f1);
		String s1=sc1.nextLine();
		while(sc1.hasNextLine()) {
			a1=sc1.nextLine().split(",");
			names.add(a1[0]);
			year.add(Integer.parseInt(a1[1]));
			month.add(Integer.parseInt(a1[2]));
			date.add(Integer.parseInt(a1[3]));
			hour.add(Integer.parseInt(a1[4]));
			min.add(Integer.parseInt(a1[5]));
			sec.add(Integer.parseInt(a1[6]));
		}
		File f2=new File("holidays2024.txt");
		Scanner sc2=new Scanner(f2);
		while(sc2.hasNextLine()) {
			s1=sc2.nextLine();
			holidays.add(s1);
		}

		String trav_dt1="";
		String trav_dt2="";
		
		LocalDate m_bday=LocalDate.of(year.get(0), month.get(0), date.get(0));
		LocalDate trav_date1 = m_bday.minusDays(1);
		LocalDate trav_date2 = m_bday.plusDays(1);
		LocalTime trav_time1 = LocalTime.of(hour.get(0), min.get(0),sec.get(0));
		LocalTime trav_time2 = LocalTime.of(hour.get(1), min.get(1),sec.get(1));
		LocalTime trav_time3 = LocalTime.of(hour.get(2), min.get(2),sec.get(2));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E,dd-MMM-yyyy");
		trav_dt1 = trav_date1.format(dtf1);
		
		String city1="BOM";
		String city2="IXE";
		for(int i=0;i<holidays.size();i++) {
			trav_date2=String.valueOf(trav_date2).equals(holidays.get(i))?trav_date2.plusDays(1):trav_date2;
		}
		trav_dt2 = trav_date2.format(dtf1);
	
		String message1 = "Please book ticket by Airindia for Akash Rao from "+city1+" to "+city2+" on "+trav_dt1+" at "+trav_time1+" hours";
		String message2 ="Please book ticket by Airindia for Akash Rao from "+city2+" to "+city1+" on "+trav_dt2+" at "+trav_time2+" hours";
		System.out.println(message1);
 		System.out.println(message2);
		
		

	}

}
