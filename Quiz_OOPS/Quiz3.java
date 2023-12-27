package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Questions1{
	private String ques;
	private String ans;
	public Questions1(String ques, String ans) {
		this.ques=ques;
		this.ans=ans;
	}
	public String[] get() {
		String[] arr1=new String[2];
		arr1[0]=ques;
		arr1[1]=ans;
		return arr1;
	}
}

public class Quiz3 {

	public static void main(String[] args) throws FileNotFoundException {
		String topic="topic.txt";
		ArrayList<String>filename=new ArrayList<>();
		ArrayList<String>quesname=new ArrayList<>();
		String[] arr2=null;
		File f1=new File(topic);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String s1=sc1.nextLine();
			arr2=s1.split(",");
			filename.add(arr2[0]);
			quesname.add(arr2[1]);
		}
		System.out.println(filename);
		
		String fname="";
		String ftype=".csv";
		Scanner sc2=new Scanner(System.in);
		for(int i=0;i<filename.size();i++) {
			System.out.println(i+1+" "+filename.get(i));
		}
		String quiz="Quiz_";
		System.out.print("Please select Quiz type ");
		int select=sc2.nextInt();
		switch(select) {
		case 1:
			fname=quiz+filename.get(select-1)+ftype;
			break;
		case 2:
			fname=quiz+filename.get(select-1)+ftype;
			break;
		case 3:
			fname=quiz+filename.get(select-1)+ftype;
			break;
		case 4:
			fname=quiz+filename.get(select-1)+ftype;
			break;
			
		}
		
		File f2=new File(fname);
		Scanner sc3=new Scanner(f2);
		ArrayList<Questions1>myList=new ArrayList<>();
		String[] arr3=null;
		sc3.nextLine();
		while(sc3.hasNext()) {
			String s1=sc3.nextLine();
			arr3=s1.split(",");
			myList.add(new Questions1(arr3[0],arr3[1]));
		}
		Collections.shuffle(myList);
		int size=0,mark=10,total=0;
		String input="";
		//System.out.println(myList.get(0).get()[0]);
		if(myList.size()>=10) {
			size=10;
		}
		else {
			size=myList.size();
		}
		Scanner sc4=new Scanner(System.in);
		ArrayList<String>wrques=new ArrayList<>();
		ArrayList<String>wrans=new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			System.out.println(quesname.get(select-1)+" "+myList.get(i).get()[0]+"?");
			input=sc4.nextLine();
			if(myList.get(i).get()[1].equalsIgnoreCase(input)) {
				total=total+mark;
			}
			else {
				total=total+0;
				wrques.add(myList.get(i).get()[0]);
				wrans.add(myList.get(i).get()[1]);
			}
		}
		System.out.println("You got "+total+"/"+size*10+" marks");
		System.out.println("\nWrong question and answer:\n");
		for(int i=0;i<wrques.size();i++) {
			System.out.println(wrques.get(i)+" : "+wrans.get(i));
		}
		
	}

}
