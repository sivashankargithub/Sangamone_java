package com.sangamone;
import java.util.ArrayList;

public class SeatSelection {

	public static void main(String[] args) {
	
		ArrayList <Integer>cols=new ArrayList<>();
		ArrayList <String>rows=new ArrayList<>();
		int row1,row2,countR;
		countR=100;
		char c1,c2;
		double temp1;
		for (int i=1;i<41;i++) {
			cols.add(i);
		}
		for(int i=0;i<26;i++) {
			c1=(char)(65+i);
			rows.add(String.valueOf(c1));
			
		}
		row1=100;
		row2=row1-26;
		for(int j=0;j<2;j++) {
			for(int i=0;i<26;i++) {
				c1=(char)(65+i);
				c2=(char)(65+j);
				rows.add(String.valueOf(c2)+String.valueOf((c1)));
			}
		}
		
		int size=rows.size();
		System.out.println(100-size+24);
		
		for(int i=0;i<(26-4);i++) {
			c1=(char)(65+i);
			rows.add("C"+String.valueOf((c1)));
		}
	
		int len1=rows.size();
		int len2=cols.size();
		
		System.out.println(cols);
		System.out.println(rows);
		System.out.println("The capacity of Infosys Auditorium is: "+len1*len2);
		System.out.println("Rows: "+len1);
		System.out.println("Cols: "+len2);

	}

}
