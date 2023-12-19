package com.sangamone;

import java.io.FileWriter;
import java.io.IOException;

public class Maths2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw1=new FileWriter("out1.txt");
		FileWriter fw2=new FileWriter("out2.txt");
		int count=100,mul=0;
		String result="";
		for(int j=2;j<count;j++) {
			for(int i=0;i<(count/j)+1;i++) {
				mul=j*i;
				result=mul+" ";
				fw1.write(result);
				System.out.print(result);
				fw2.write((char)(mul));
				fw2.write(" ");
				
			}
			fw1.write("\n");
			System.out.println();
			fw2.write("\n");
		}
		fw1.close();
		System.out.println();
		fw2.close();
		
	}

}
