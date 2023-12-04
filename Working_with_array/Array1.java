package com.sangamone;

public class Array1 {

	public static void main(String[] args) {
		int[][] sales=new int[12][31];
		int[] days=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] sales_mon=new int[12];
		int month_t=0,grandtotal=0,total_m=0;
		
		for(int i=0;i<12;i++){
			System.out.print((i+1)+"-");
			for(int j=0;j<days[i];j++) {
				sales[i][j]=(int)(Math.random()*10);
				System.out.print(sales[i][j]+",");
				month_t=month_t+sales[i][j];
			}
			System.out.println(" ");
			sales_mon[i]=month_t;
			grandtotal = grandtotal+sales_mon[i];
			month_t=0;
			System.out.print("\n");
		}
		for(int i=0;i<12;i++) {
			System.out.println("Sales of Month "+(i+1)+"="+sales_mon[i]);
		}
		System.out.println("Grand Total : "+grandtotal);
	}

}
