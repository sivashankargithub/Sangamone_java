package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perm1 {
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

	public static void main(String[] args) throws FileNotFoundException {
		List<String>words=new ArrayList<>();
		String word="";
		File f1 = new File("perm_words.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			words.add(sc1.nextLine());
		} 
		sc1.close();
		
//		word=words.get(0);
//		System.out.println(perm3(word));
//		
//		word=words.get(1);
//		System.out.println(perm4(word));
		
//		word=words.get(2);
//		System.out.println(perm5(word));
		
		word=words.get(3);
		System.out.println(perm6(word));
	}

}
