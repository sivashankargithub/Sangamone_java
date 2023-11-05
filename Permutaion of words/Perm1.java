package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perm1 {
	public static List<String> perm9(String word){
		List<String>words = new ArrayList<>();
		List<String>result = new ArrayList<>();
		String s1,s2;
		
		s1=word.substring(0,1); //B
		s2=word.substring(1,9); //EAUTIFUL
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(1,2); //E
		s2=word.substring(2,9)+word.substring(0,1); //AUTIFUL+B
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(2,3); //A
		s2=word.substring(3,9)+word.substring(0,2); //UTIFUL+BE
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(3,4); //U
		s2=word.substring(4,9)+word.substring(0,3); //TIFUL+BEA
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(4,5); //T
		s2=word.substring(5,9)+word.substring(0,4); //IFUL+BEAU
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(5,6); //I
		s2=word.substring(6,9)+word.substring(0,5); //FUL+BEAUT
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(6,7); //F
		s2=word.substring(7,9)+word.substring(0,6); //UL+BEAUTI
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(7,8); //U
		s2=word.substring(8,9)+word.substring(0,7); //L+BEAUTIF
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		s1=word.substring(8,9); //L
		s2=word.substring(0,8); //BEAUTIFU
		result=perm8(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s2);
		}
		
		return words;
		
	}
	
	public static List<String> perm8(String word){
		List<String>words=new ArrayList<>();
		List<String>result=new ArrayList<>();
		String s1,s2;
		
		s1=word.substring(0,1); //P
		s2=word.substring(1,8); //ROGRESS
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(1,2); //R
		s2=word.substring(2,8)+word.substring(0,1); //OGRESS+P
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(2,3); //O
		s2=word.substring(3,8)+word.substring(0,2); //GRESS+PR
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(3,4); //G
		s2=word.substring(4,8)+word.substring(0,3); //RESS+PRO
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(4,5); //R
		s2=word.substring(5,8)+word.substring(0,4); //ESS+PROG
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(5,6); //E
		s2=word.substring(6,8)+word.substring(0,5); //SS+PROGR
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(6,7); //S
		s2=word.substring(7,8)+word.substring(0,6); //S+PROGRE
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(7,8); //S
		s2=word.substring(0,7); //PROGRES
		result=perm7(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		return words;
	}
	
	public static List<String> perm7(String word){
		List<String>words=new ArrayList<>();
		List<String>result=new ArrayList<>();
		String s1,s2;
		
		s1=word.substring(0,1); //S
		s2=word.substring(1,7); //INCERE
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(1,2); //I
		s2=word.substring(2,7)+word.substring(0,1);//NCERE+S
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(2,3); //N
		s2=word.substring(3,7)+word.substring(0,2);//CERE+SI
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(3,4); //C
		s2=word.substring(4,7)+word.substring(0,3);//ERE+SIN
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(4,5); //E
		s2=word.substring(5,7)+word.substring(0,4);//RE+SINC
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(5,6); //R
		s2=word.substring(6,7)+word.substring(0,5);//E+SINCE
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(6,7); //E
		s2=word.substring(0,6); //SINCER
		result=perm6(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		return words;
		
	}
	
	public static List<String> perm6(String word){
		List<String>words=new ArrayList<>();
		List<String>result=new ArrayList<>();
		String s1,s2;
		
		s1=word.substring(0,1); //F
		s2=word.substring(1,6); //ASTER
		result=perm5(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(1,2); //A
		s2=word.substring(2,6)+word.substring(0,1); //STER+F
		result=perm5(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(2,3); //S
		s2=word.substring(3,6)+word.substring(0,2); //TER+FA
		result=perm5(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(3,4); //T
		s2=word.substring(4,6)+word.substring(0,3); //ER+FAS
		result=perm5(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(4,5); //E
		s2=word.substring(5,6)+word.substring(0,4); //R+FAST
		result=perm5(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(5,6); //R
		s2=word.substring(0,5); //FASTE
		result=perm5(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		return words;
	}
	
	public static List<String> perm5(String word){
		List<String> result = new ArrayList<>();
		List<String> words = new ArrayList<>();
		String s1,s2;
		
		s1=word.substring(0,1);  //S
		s2=word.substring(1,5);  //MILE
		result=perm4(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(1,2);  //M
		s2=word.substring(2,5)+word.substring(0,1);  //ILE+S
		result=perm4(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(2,3);  //I
		s2=word.substring(3,5)+word.substring(0,2);  //LE+SM
		result=perm4(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(3,4);  //L
		s2=word.substring(4,5)+word.substring(0,3);  //E+SMI
		result=perm4(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(4,5);  //E
		s2=word.substring(0,4);  //SMIL
		result=perm4(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		return words;
	}
	
	public static List<String> perm4(String word){
		List<String>words = new ArrayList<>();
		List<String>result = new ArrayList<>();
		String s1,s2;
		
		s1=word.substring(0,1);  // F
		s2=word.substring(1,4);   // AST
		result=perm3(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(1,2);   //A
		s2=word.substring(2,4)+word.substring(0,1);   //ST+F
		result=perm3(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(2,3);  //S
		s2=word.substring(3,4)+word.substring(0,2); //T+FA
		result=perm3(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		s1=word.substring(3,4);  //T
		s2=word.substring(0,3); //FAS
		result=perm3(s2);
		for(int i=0;i<result.size();i++) {
			words.add(result.get(i)+s1);
		}
		
		return words;
	}
	
	public static List<String> perm3(String word){
		List<String>words = new ArrayList<>();
		String s1,s2,s3;
		s1=word.substring(0,1);
		s2=word.substring(1,2);
		s3=word.substring(2,3);
		words.add(s1+s2+s3);
		words.add(s1+s3+s2);
		words.add(s2+s1+s3);
		words.add(s2+s3+s1);
		words.add(s3+s1+s2);
		words.add(s3+s2+s1);
		return words;
		
	}

	public static void main(String[] args) throws IOException {
		List<String>words=new ArrayList<>();
		List<String>result=new ArrayList<>();
		String word="";
		File f1 = new File("perm_words.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			words.add(sc1.nextLine());
		} 
		sc1.close();
		
		String permut="";
		int len1;
		
		FileWriter f2=new FileWriter("out_perm3.txt");
		word=words.get(0);
		result=perm3(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i);
			f2.write(permut);
			if(i<len1-1) {  //this will avoid printing extra line the end of file.
				f2.write("\n");
			}
		}
		f2.close();
		
		f2=new FileWriter("out_perm4.txt");
		word=words.get(1);
		result=perm4(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i);
			f2.write(permut);
			if(i<len1-1) {
				f2.write("\n");
			}
		}
		f2.close();
		
		
		f2=new FileWriter("out_perm5.txt");
		word=words.get(2);
		result=perm5(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i);
			f2.write(permut);
			if(i<len1-1) {
				f2.write("\n");
			}
		}
		f2.close();
		
		f2=new FileWriter("out_perm6.txt");
		word=words.get(3);
		result=perm6(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i);
			f2.write(permut);
			if(i<len1-1) {
				f2.write("\n");
			}
		}
		f2.close();
		
		f2=new FileWriter("out_perm7.txt");
		word=words.get(4);
		result=perm7(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i);
			f2.write(permut);
			if(i<len1-1) {
				f2.write("\n");
			}
		}
		f2.close();
		
		f2=new FileWriter("out_perm8.txt");
		word=words.get(5);
		result=perm8(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i);
			f2.write(permut);
			if(i<len1-1) {
				f2.write("\n");
			}
		}
		f2.close();
		
		f2=new FileWriter("out_perm9.txt");
		word=words.get(6);
		result=perm9(word);
		len1=result.size();
		for(int i=0;i<len1;i++) {
			permut=result.get(i).toString();
			f2.write(permut);
			if(i<len1-1) {
				f2.write("\n");
			}
		}
		f2.close();
	}
}
