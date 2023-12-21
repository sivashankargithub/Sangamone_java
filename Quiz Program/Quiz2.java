package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
class RandNum{
	public ArrayList<Integer> randNum1(){
		ArrayList<Integer>list1=new ArrayList<>();
		Set<Integer>set1=new LinkedHashSet<>(); 
		Random rand=new Random();
		for (int i=0;i<50;i++) {
			list1.add(rand.nextInt(13));
		}
		set1.addAll(list1);
		list1.clear();
		list1.addAll(set1);
		return list1;
	}
}

class Questions{
	ArrayList<String>questions=new ArrayList<>();
	ArrayList<String>answers=new ArrayList<>();
	String[] arr1= null;
	ArrayList<ArrayList<String>>quesans=new ArrayList<>();
	public ArrayList<ArrayList<String>> fileread() throws Exception{
		File f1=new File("Quiz_Capitals.csv");
		Scanner sc1=new Scanner(f1);
		sc1.nextLine();//dummy print
		while(sc1.hasNextLine()) {
			arr1=sc1.nextLine().split(",");
			questions.add(arr1[0]);
			answers.add(arr1[1]);
		}
		quesans.add(0, questions);
		quesans.add(1, answers);
		sc1.close();
		return quesans;
		
	}	
}
class Results{
	ArrayList<Integer>randList=new ArrayList<>();
	ArrayList<String>questions=new ArrayList<>();
	ArrayList<String>answers=new ArrayList<>();
	ArrayList<Integer>marks=new ArrayList<>();
	ArrayList<String>wrques=new ArrayList<>();
	ArrayList<String>wrans=new ArrayList<>();
	ArrayList<ArrayList<String>>quesans=new ArrayList<>();
	int totmarks=0;
	public void results1() throws Exception {
		RandNum randNum=new RandNum();
		randList=randNum.randNum1();
		
		Questions ques=new Questions();
		quesans=ques.fileread();
		
		questions.addAll(quesans.get(0));
		answers.addAll(quesans.get(1));
		
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("What is the Capital of "+questions.get(randList.get(i)));
			String s1=sc1.nextLine();
			if(s1.equalsIgnoreCase(answers.get(randList.get(i)))) {
				System.out.println("Correct");
				marks.add(10);
			}
			else {
				System.out.println("Wrong");
				marks.add(0);
				wrques.add(questions.get(randList.get(i)));
				wrans.add(answers.get(randList.get(i)));
			}
			totmarks =totmarks+marks.get(i);
		}
		System.out.println();
		System.out.println("You got "+totmarks+" marks");
		System.out.println();
		if(wrques.size()>=1) {
			for(int i=0;i<wrques.size();i++) {
				System.out.println(wrques.get(i)+" - "+wrans.get(i));
			}
		}
		
	}
}

public class Quiz2{
	public static void main(String[] args) throws Exception{
		Results res=new Results();
		res.results1();
	}

}
