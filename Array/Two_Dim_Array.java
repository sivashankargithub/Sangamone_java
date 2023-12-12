package com.sangamone;

public class Two_Dim_Array {

	public static void main(String[] args) {
		String[][] cricPlay11= {{"Top-Order","Top-Order","Middle   ","Middle   ","Finisher ","Finisher ","All-Rounder","Fast-Bowler","Spin-Bowler","Fast-Bowler","Fast-Bowler"},{"Ruturaj Gaikwad","Yashaswi Jaiswal","Sivashankar","SurayKumar Yadav","Rinku Singh","Jitesh Sharma","Ravindra Jadeja","Deepak Chahar","Ravi Bishnoi","Mohammed Siraj","Mukesh Kumar"}};
		System.out.println("-------Indian Palying 11--------");
		System.out.println("  Role             Name");
		for(int i=0;i<cricPlay11[0].length;i++) {
			System.out.println(cricPlay11[0][i] + "     " + cricPlay11[1][i]);
		}
	}
}
