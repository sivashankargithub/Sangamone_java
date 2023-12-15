package ConditionalStatement;

import java.util.Scanner;

public class Switchdemo {
	public static void main(String args[]) {
		int choice,a,b,c = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Number");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Enter 1=>add 2=>sub 3=>mul 4=>div");
		System.out.println("Enter Your Choice");
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			c = a+b;
			break;
		case 2:
			c = a-b;
			break;
		case 3:
			c = a*b;
			break;
		case 4:
			c = a/b;
			break;
		default:
			System.out.println("Wrong Choice");
		}
		System.out.println("The Answer = "+c);
		
		}
}
