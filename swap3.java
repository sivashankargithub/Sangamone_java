package sangamone_pack;

import java.util.Scanner;

public class swap3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-----Swappig of 2 Numbers-------\n");
		System.out.println("Enter first number:");
		int i=sc.nextInt();
		System.out.println("Enter second number:");
		int j=sc.nextInt();
		int temp=0;
		temp=i;    //temp=40
		i=j;       //i=60
		j=temp;    //j=40
		System.out.println("------After Swapping-----\n");
		System.out.println("First number= "+i+"\nSecond number= "+j);
		
	}

}
