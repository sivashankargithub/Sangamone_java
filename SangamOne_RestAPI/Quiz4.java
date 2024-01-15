import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Quiz1 {
    public static void takeQuiz(String fname, String str1)throws Exception{
        File f1 = new File(fname);
        ArrayList<String>questions = new ArrayList<>();
        ArrayList<String>answers = new ArrayList<>();
        String[] arr1 = new String[2];
        int[] arr2 = new int[10];
        int total = 0,marks = 10;
        Scanner sc1 = new Scanner(f1);
        Scanner sc2 = new Scanner(System.in);
        String response1,s1,s2,info1;
        s1 = str1;s2 = " ?";
        info1 = sc1.nextLine();
        for(int i  = 0; i<3; i++) {
            info1 = sc1.nextLine();
            arr1 = info1.split(",");
            questions.add(arr1[0]);
            answers.add(arr1[1]);
            System.out.print(s1 + arr1[0] + s2);
            response1 = sc2.nextLine();
            if(response1.equals(arr1[1])) {
                arr2[i] = marks;
            }
            else{
                arr2[i] = 0;
            }
        }
        System.out.print("The marks you have scored is: ");
        for (int i = 0; i < 3; i++) {
            total = total+arr2[i];
            //System.out.print(arr2[i]+" ");
        }
        System.out.println(total);
        System.out.println();
        for(int i = 0; i < 3; i++) {
            if(arr2[i] == 0) {
                System.out.println("Q"+(i+1)+" - "+s1+questions.get(i)+s2);
                System.out.println("A"+(i+1)+" - "+answers.get(i));
                System.out.println();
            }
        }
    }
    public static void main(String[]args)throws Exception{
        String s1 = "";
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the category: ");
        String subject = sc1.next();
        if(subject.equals("Capital")){
            s1 = "What is the capital of ";
            takeQuiz("D:\\Java and kotlin programs\\Quiz_Capitals.csv", s1);
        }
        else if(subject.equals("Currency")){
            s1 = "What is the currency of ";
            takeQuiz("D:\\Java and kotlin programs\\Quiz_Currency.csv", s1);
        }
        else if(subject.equals("Sports")){
            s1 = "What is the Sport of ";
            takeQuiz("D:\\Java and kotlin programs\\Quiz_Sport.csv", s1);
        }
    }
}
/*
capitals - D:\Java and kotlin programs\Quiz_Capitals.csv
currency - D:\Java and kotlin programs\Quiz_Currency.csv
sports - D:\Java and kotlin programs\Quiz_Sport.csv
 */