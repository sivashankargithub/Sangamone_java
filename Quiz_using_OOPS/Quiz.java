package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) throws Exception {
		ArrayList<QuesTopic>topic=new ArrayList<>();
    	String file_name ="topic.txt";
    	String[] arr1=null;
         File f1=new File(file_name);
         Scanner sc1=new Scanner(f1);
         while(sc1.hasNextLine()){
             String s1=sc1.nextLine();
             arr1=s1.split(",");
             topic.add(new QuesTopic(arr1[0], arr1[1]));
         }
         sc1.close();
         Mod_Quiz quiz2=new Mod_Quiz();
         quiz2.func1(topic);
	}

}
