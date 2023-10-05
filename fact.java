package sangamone_pack;
import java.util.Scanner;
public class fact {

	public static void main(String args[]) 
	{	
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("---Factorial---");
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
			fact=fact*i;
		{
			System.out.println("Factorial of "+num+" is: "+fact);
		}
		
	}

}
