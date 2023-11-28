package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class FileTemp{
	public static ArrayList<String> fileRead() throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		File f1= new File("words_input.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
		}
		sc1.close();
		return list1;
		
		
	}
}

public class FiguresToWords {
	public static String wordTies(int n1, ArrayList<String> list1) {
		if(n1==30) {
			String num30=list1.get(20);
			return num30;
		}
		if(n1==40) {
			String num30=list1.get(21);
			return num30;
		}
		if(n1==50) {
			String num30=list1.get(22);
			return num30;
		}
		if(n1==60) {
			String num30=list1.get(23);
			return num30;
		}
		if(n1==70) {
			String num30=list1.get(24);
			return num30;
		}
		if(n1==80) {
			String num30=list1.get(25);
			return num30;
		}
		if(n1==90) {
			String num30=list1.get(26);
			return num30;
		}
		else {
			String num30=list1.get(27);
			return num30;
		}
		
	}
	public static String word20(int n1, ArrayList<String> list1){
		
		int position=n1-1;
		String word1=list1.get(position);
		return word1;
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String>list1=new ArrayList<>();
		FileTemp fileTemp = new FileTemp();
		list1.addAll(fileTemp.fileRead());
		System.out.println(list1);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n1=sc2.nextInt();
		
		if(n1<=20) {
			System.out.print(word20(n1,list1));
		}
		else if(n1>20 && n1<30) {
			int part1 = (n1/10)*10;
			int part2=n1%10;
			System.out.print(word20(part1,list1)+" ");
			System.out.print(word20(part2,list1));
		}
		else if(n1==30 || n1==40 ||n1==50 || n1==60 || n1==70 || n1==80 || n1==90 || n1==100 ) {
			System.out.println(wordTies(n1,list1));
		}
		else {
			int part1=(n1/10)*10;
			int part2=n1%10;
			System.out.print(wordTies(part1,list1)+" ");
			System.out.print(word20(part2,list1));
		}
	}
}
