package com.sangamone;

import java.util.ArrayList;
import java.util.Scanner;

public class EncryptDecrypt {
	public static ArrayList<String> alpha(){
		ArrayList<String>alpha=new ArrayList<>();
		char c1;
		String s1="";
		alpha.add(" ");
		for(int i=0;i<26;i++) {
			c1=(char)(65+i);
			s1=String.valueOf(c1);
			alpha.add(s1);
		}
		for(int i=0;i<26;i++) {
			c1=(char)(97+i);
			s1=String.valueOf(c1);
			alpha.add(s1);
		}
		alpha.add(".");
		alpha.add("@");
		return alpha;
	}
	public static ArrayList<String> numeric(){
		ArrayList<String>numeric=new ArrayList<>();
		boolean b1;
		for(int i=0;i<alpha().size();i++) {
			b1=i<10?numeric.add("0"+i):numeric.add(""+i);
		}
		return numeric;
	}
	public static String encrypt(String input) {
		ArrayList<String>alpha=new ArrayList<>();
		ArrayList<String>numeric=new ArrayList<>();
		alpha=alpha();
		numeric=numeric();
		String slice="";
		String encrypted="";
		int pos=0;
		for(int i=0;i<input.length();i++) {
			slice=input.substring(i,i+1);
			pos=alpha.indexOf(slice);
			encrypted=encrypted+numeric.get(pos);
		}
		return encrypted;
	}
	public static String decrypt(String code) {
		ArrayList<String>alpha=new ArrayList<>();
		ArrayList<String>numeric=new ArrayList<>();
		alpha=alpha();
		numeric=numeric();
		String slice="";
		int pos=0;
		String msg="";
		
		for(int i=0;i<code.length()/2;i++) {
			slice=code.substring(2*i,2*(i+1));
			pos=numeric.indexOf(slice);
			msg=msg+alpha.get(pos);
		}
		return msg;
	}
	public static void main(String[] args) {
		System.out.print("Enter a message : ");
		Scanner sc1=new Scanner(System.in);
		String input=sc1.nextLine();
		sc1.close();
		String code=encrypt(input);
		String msg=decrypt(code);
		System.out.println("Encrypted code : "+code);
		System.out.println("Decrypted message : "+msg);
	}

}