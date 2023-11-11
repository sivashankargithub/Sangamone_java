package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentWebsite{
    public static void main(String[] args) throws IOException{
        File f1=new File("StudentWebsite.txt");
        FileWriter fw1;
        List<String> subjects=new ArrayList<>();
        List<String> names;
        List<List<String>> all_names=new ArrayList<>();
        String[] a1=null;
        String[] a2=null;
        int len1;
        String course_name;
        String sub_stu_name;
        String student_name;
        String stu_file_name;
        String html_code;
        Scanner sc1=new Scanner(f1);
        while(sc1.hasNextLine()){
            names=new ArrayList<>();
            a1=sc1.nextLine().split(":");
            subjects.add(a1[0]);
            a2=a1[1].split(",");
            len1=a2.length;
            for(int i=0;i<len1;i++){
                names.add(a2[i]);
            }
            all_names.add(names);
        }
        for (int j = 0; j <all_names.size() ; j++) {
            len1 = all_names.get(j).size();
            for(int  i=0;i<len1;i++){
                course_name=subjects.get(j);
                f1=new File(course_name);
                f1.mkdir();
                sub_stu_name = course_name+"/" + all_names.get(j).get(i);
                f1=new File(sub_stu_name);
                f1.mkdir();
                student_name = all_names.get(j).get(i);
                stu_file_name = sub_stu_name + "/" + all_names.get(j).get(i) + ".html";
                fw1=new FileWriter(stu_file_name);
                html_code="<!DOCTYPE html>\n"+
                "<html>\n"+
                "<head>\n"+
                "</head>"+
                "<body>\n"+
                "<h1>My name is " +student_name+ "</h1>\n"+
                "<h2>I am studying " +course_name+ "</h2>\n"+
                "</body>"+
                "</html>";
                fw1.write(html_code);
                fw1.close();
            }
        }
        System.out.println("Successfully web pages created");
    }
}
