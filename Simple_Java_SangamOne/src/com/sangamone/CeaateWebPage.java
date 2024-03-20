package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CeaateWebPage {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<String>names=new ArrayList<>();
		List<String>emails=new ArrayList<>();
		List<String>numbers=new ArrayList<>();
		FileWriter fw1=null;
		File f1=new File("users.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1=sc1.nextLine().split(",");
			numbers.add(arr1[0]);
			emails.add(arr1[1]);
			names.add(arr1[2]);
		}
		
		File f2 = new File("template.html");
		Scanner sc2=null;
		String s1="";
		
		for(int i=0;i<numbers.size();i++) {
			sc2=new Scanner(f2);
			String fname1=numbers.get(i);
			String fname2=".html";
			String fname=fname1+fname2;
			fw1=new FileWriter(fname);
			while(sc2.hasNext()) {
				s1=sc2.nextLine()
						.replace("name", names.get(i))
						.replace("email",emails.get(i));
				fw1.write(s1);
				fw1.write("\n");
			}
			fw1.close();
			sc1.close();
		}
		
	}

}
