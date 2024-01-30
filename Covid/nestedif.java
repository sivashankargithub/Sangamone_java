package ConditionalStatement;

import java.util.Scanner;

public class nestedif {
	public static void main(String args[]) {
		int uname,pass;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Userid and Password");
		uname = s.nextInt();
		pass = s.nextInt();
		
		if(uname==123) {
			if(pass==123) {
				System.out.println("Logged in Success");
			}
			else {
				System.out.println("Password Wrong");
			}
		}
		else {
			System.out.println("Userid Wrong");
		}
	}
}
