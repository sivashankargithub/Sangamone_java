package com.sangamone;

public class Diamond1 {


    public static void main(String[] args) {
        String str1 = "FUNWITHPROGRAMMINGISFUNFORALLOFUS";
        int len = str1.length();
        int len2 = (len / 2);
        String s1 = "";
        String spaceholder = " ";

        // Upper part of the diamond
        for (int j = 0; j < len2 + 1; j++) {
            for (int i = 0; i < (len2 - j); i++) {
                System.out.print(spaceholder);
            }
            s1 = str1.substring(0, len - 2 * (len2 - j));
            System.out.print(s1);
            System.out.println();
        }

        // Lower part of the diamond
        for (int j = len2 - 1; j >= 0; j--) {
            for (int i = 0; i < (len2 - j); i++) {
                System.out.print(spaceholder);
            }
            s1 = str1.substring(0, len - 2 * (len2 - j));
            System.out.print(s1);
            System.out.println();
        }
    }
}