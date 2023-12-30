package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class  Question{
    private String ques,ans;
    Question(String ques,String ans){
        this.ques=ques;
        this.ans=ans;
    }
    public String[] getQues(){
    	String[] arr1=new String[2];
    	arr1[0]=ques;
    	arr1[1]=ans;
    	return arr1;
    }
}
class WrongQues{
	private String wrques1,wrans1;
	WrongQues(String wrques1, String wrans1){
		this.wrques1=wrques1;
        this.wrans1=wrans1;
	}
	public String[] getWrQues() {
		String[] arr1=new String[2];
		arr1[0]=wrques1;
		arr1[1]=wrans1;
		return arr1;
	}
}
class QuesTopic{
	private String topic1,ques_mod;
	QuesTopic(String topic1, String ques_mod){
		this.topic1=topic1;
		this.ques_mod=ques_mod;
	}
	public String[] gettopic() {
		String[] arr1=new String[2];
		arr1[0]=topic1;
		arr1[1]=ques_mod;
		return arr1;
	}
}
public class Mod_Quiz {
	public static void func1(ArrayList<QuesTopic> topic) throws Exception {
		int tot_quiz=10;
        String[] arr2;
        int len1=topic.size();
        for(int i=0;i<len1;i++){
        	String str1=topic.get(i).gettopic()[0];
            System.out.println((i+1)+" "+str1);
        }
        Scanner sc2=new Scanner(System.in);
        System.out.println("Select Quiz type: ");
        int choice=sc2.nextInt();
        String filename="";
        String category=topic.get(choice-1).gettopic()[0];
        filename="Quiz_"+category+".csv"; 
        File f2= new File(filename);
        Scanner sc3=new Scanner(f2);
        ArrayList<Question> mylist1=new ArrayList<>();
        sc3.nextLine();
        while(sc3.hasNextLine()){
            String s1=sc3.nextLine();
            arr2=s1.split(",");
            mylist1.add(new Question(arr2[0],arr2[1]));
        }
        Collections.shuffle(mylist1);
        int size=0,marks=10,total=0;
        if(mylist1.size()>=tot_quiz){
            size=tot_quiz;
        }
        else{
            size = mylist1.size();
        }
        Scanner sc4=new Scanner(System.in);
        ArrayList<WrongQues>wrques=new ArrayList<>();
        for(int i=0;i<size;i++){
        	String str=topic.get(choice-1).gettopic()[1];
            System.out.println(str+" "+mylist1.get(i).getQues()[0]);
            String input=sc4.nextLine();
            if(mylist1.get(i).getQues()[1].equalsIgnoreCase(input)){
                total=total+marks;
            }
            else{
                total=total+0;
                String str1=mylist1.get(i).getQues()[0];
                String str2=mylist1.get(i).getQues()[1];
                wrques.add(new WrongQues(str1,str2));
            }
        }
        System.out.println("You scored "+total+"/"+size*10+" marks");
        System.out.println("\nWrong Questions and Answers :\n");
        for(int i=0;i<wrques.size();i++){
            System.out.println(wrques.get(i).getWrQues()[0]+" : "+wrques.get(i).getWrQues()[1]);
        }
        sc2.close();
        sc3.close();
        sc4.close();
	}
}