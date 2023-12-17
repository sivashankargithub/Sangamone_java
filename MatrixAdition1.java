package com.sangamone;

public class MatrixAdition1 {

	public static void main(String[] args) {
		int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}}; //3 rows and 3 column
		int[][] mat2 = {{9,8,7},{6,5,4},{3,2,1}}; //3 rows and 3 column
		int[][] addmat= new int[3][3];
		for(int j=0;j<3;j++) {//add rows
			for(int i=0;i<3;i++) {//add column
				addmat[j][i]=mat1[j][i]+mat2[j][i];
				System.out.print(addmat[j][i]+" ");
			}
			System.out.println();
		}
	}
}
