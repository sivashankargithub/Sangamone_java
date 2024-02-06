package ConditionalStatement;

import java.util.Scanner;

public class elseifdemo {
	public static void main(String args[]) {
	//Room Booking App
	String name,contact,idno,dob;
	int days,rooms,total;
	int rent =1000;
	double dis,netpay;

	Scanner s = new Scanner(System.in);
	System.out.println("Enter Name ");
	name = s.next();
	System.out.println("Enter Contact Number ");
	contact = s.next();
	System.out.println("Enter Id Proof Number ");
	idno = s.next();
	System.out.println("Enter Date of Booking ");
	dob = s.next();
	System.out.println("Enter No.of.days ");
	days = s.nextInt();
	System.out.println("Enter No.of.rooms ");
	rooms = s.nextInt();
	/* total<=5000 - 2%
	 * total>5000 && total<=1000 - 5%
	 * total>10000 && total<=20000 - 10%
	 * total>20000 && total<=40000 - 20%
	 * total>40000 - 30%
	 */
	
	total = rent*days*rooms;
	
	if(total<=5000) {
		dis = 0.02*total;
		netpay = total-dis;
	}
	else if(total>5000 && total<=10000) {
		dis = 0.05*total;
		netpay = total-dis;
	}
	else if(total>10000 && total<=20000) {
		dis = 0.1*total;
		netpay = total-dis;
	}
	else if(total>20000 && total<=40000) {
		dis = 0.2*total;
		netpay = total-dis;
	}
	else {
		dis = 0.3*total;
		netpay = total-dis;
	}
	
	System.out.println("**************Billing Details************");
	System.out.println("Name : "+name);
	System.out.println("Contact Number : "+contact);
	System.out.println("Id Number : "+idno);
	System.out.println("Date of Booking : "+dob);
	System.out.println("No.of.rooms : "+rooms);
	System.out.println("No.of.days : "+days);
	System.out.println("Total Amount : "+total);
	System.out.println("Discount : "+dis);
	System.out.println("Net Amount : "+netpay);
	System.out.println("**********Thanks for Visiting Us***********");
	}
}
