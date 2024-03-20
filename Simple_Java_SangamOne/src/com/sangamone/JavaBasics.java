package com.sangamone;

public class JavaBasics {
	
	public static void main(String[] args) {
		int[] num=new int[] {9,4,6,8,0,2,1};
		int[] out=new int[num.length];
		int temp=0;
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;i++) {
				temp=0;
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];// num[0]=4
					num[j]=temp;//num[1]=9
				}
			}
			System.out.println(num[i]);
		}

	}

}
