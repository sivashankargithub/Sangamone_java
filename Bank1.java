package com.sangamone;
import java.util.*;

public class Bank1 {

	public static void main(String[] args) {
		
		bank1();
		System.out.println();
		System.out.println();
		bank2();
			}
	
	public static double bank1(){
		
		double t=1.0/365;
		double r1=5.0/100;
		
		List<Integer>spend1=new ArrayList<>();//spend
		spend1.add(20000);//day1
		spend1.add(5333);//day5
		spend1.add(7500);//day10
		spend1.add(2000);//12
		spend1.add(800);//20
		spend1.add(400);//25
		spend1.add(300);//28
		spend1.add(750);//29
		spend1.add(1000);//30
		
		List<Integer> rem_bal1=new ArrayList<>();//balance
			rem_bal1.add(spend1.get(0));//14667
			for(int i=0;i<spend1.size()-1;i++)
			{
				rem_bal1.add(rem_bal1.get(i)-spend1.get(i+1));
			}
		//System.out.println(rem_bal1);
		List<Double> cal1=new ArrayList<>();
		for(int i=0;i<rem_bal1.size();i++) {
			cal1.add(rem_bal1.get(i)*t*r1);
		}
		List<Double> cal2=new ArrayList<>();
		cal2.add(cal1.get(0)*5);//20000*4days
		cal2.add(cal1.get(1)*5);
		cal2.add(cal1.get(2)*2);
		cal2.add(cal1.get(3)*8);
		cal2.add(cal1.get(4)*5);
		cal2.add(cal1.get(5)*3);
		cal2.add(cal1.get(6)*1);
		cal2.add(cal1.get(7)*1);
		cal2.add(cal1.get(8)*1);
		double sumofinterest=0;
		for(int i=0;i<cal2.size();i++) {
			sumofinterest+=cal2.get(i);
		}
		System.out.println("--------------------Bank1 Interest Calculation--------------------");
		System.out.println();
		System.out.println("The total interest of Bank1 for the month of July is : "+sumofinterest);
		return sumofinterest;
	}
	public static double bank2() {
		double r2=8.0/100;
		double t=1.0/365;
		List<Integer>spend2=new ArrayList<>();//bank2
		spend2.add(20000);//day1
		spend2.add(5333);//5
		spend2.add(7500);//10
		spend2.add(1500);//11
		spend2.add(700);//15
		spend2.add(400);//18
		spend2.add(450);//20
		spend2.add(300);//21
		spend2.add(750);//30
		spend2.add(1000);//31
		
		List<Integer>rem_bal2=new ArrayList<>();
		rem_bal2.add(spend2.get(0));
		for(int i=0;i<spend2.size()-1;i++) {
			rem_bal2.add(rem_bal2.get(i)-spend2.get(i+1));
		}
		List<Double> cal3=new ArrayList<>();
		for(int i=0;i<rem_bal2.size();i++) {
			cal3.add(rem_bal2.get(i)*t*r2);
		}
		List<Double> cal4=new ArrayList<>();
		cal4.add(cal3.get(0)*4);//20000 was there for 4 days
		cal4.add(cal3.get(1)*5);
		cal4.add(cal3.get(2)*1);
		cal4.add(cal3.get(3)*4);
		cal4.add(cal3.get(4)*3);
		cal4.add(cal3.get(5)*2);
		cal4.add(cal3.get(6)*1);
		cal4.add(cal3.get(7)*9);
		cal4.add(cal3.get(8)*1);
		cal4.add(cal3.get(9)*1);
		double sumofinterest=0;
		for(int i=0;i<cal4.size();i++) {
			sumofinterest+=cal4.get(i);
		}
		System.out.println("--------------------Bank2 Interest Calculation--------------------");
		System.out.println();
		System.out.println("The total interest of Bank2 for the month of August is : "+sumofinterest);

		return sumofinterest;
		
	}

}
