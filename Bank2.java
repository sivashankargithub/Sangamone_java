package com.sangamone;

import java.io.*;
import java.util.*;

public class Bank2 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>s_date=new ArrayList<>();
		File f1=new File("Assignment_Interest_Calculation.xlsx");
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
			String info1=sc.nextLine();
			System.out.println(info1);
		}	
	}
}
