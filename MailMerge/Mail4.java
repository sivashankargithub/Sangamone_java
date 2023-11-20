package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Mail4 {
	public static void msg1(String fname1,String fname2) throws Exception{
		File f1=new File(fname1);
		File f2=new File(fname2);
		FileWriter fw=new FileWriter("output.txt");
		Scanner sc1=new Scanner(f1);
		Scanner sc2=new Scanner(f2);
		String s1="",s2="",msg="",temp1="",temp2="";
		String[] arr1=null,arr2=null;
		int len1=0,len2=0,pos=0;
		s1=sc1.nextLine();
		arr1=s1.split(" ");
		while(sc2.hasNextLine()) {
			s2=sc2.nextLine();
			arr2=s2.split(", ");
			len2=arr2.length;
			for(int i=0;i<len2;i++) {
				arr2[i]=arr2[i].equals("M")?arr2[i].replace("M","Mr."):arr2[i].replace("F","Ms.");
			}
			pos=0;
			msg="";
			len1=arr1.length;
			for(int i=0;i<len1;i++) {
				temp1=arr1[i];
				if(!temp1.contains("$")) {
					msg=msg+" "+temp1;
				}
				else {
					msg=msg+" "+arr2[pos++];
				}
			}
			fw.write(msg);
			fw.write("\n");
			System.out.println(msg);
		}
		fw.close();
	}
	public static void main(String[] args) throws Exception {
		msg1("template.txt","list1.txt");
	}
}
