package com.sangamone;

import java.util.ArrayList;
import java.util.Random;

public class Password {
	public static void main(String[] args) {
        ArrayList<Character> pass1=new ArrayList<>();
        Random rand=new Random();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<3;i++) {
            char randomupper = (char) (rand.nextInt(26) + 'A');
            System.out.print(randomupper);
            pass1.add(randomupper);
        }
        for(int i=0;i<3;i++) {
            char randomlower = (char) (rand.nextInt(26) + 'a');
            System.out.print(randomlower);
            pass1.add(randomlower);
        }
        for(int i=0;i<3;i++) {
            char randomdigit = (char)(rand.nextInt(10) + '0');
            System.out.print(randomdigit);
            pass1.add(randomdigit);
        }
        System.out.println(pass1);
        for(int i=0;i<6;i++){
            int index= rand.nextInt(pass1.size());
            str.append(pass1.get(index));
        }
        System.out.println(str);
    }
}