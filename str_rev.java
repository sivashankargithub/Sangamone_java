package sangamone_pack;

import java.util.Scanner;

public class str_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("----String Reverse Program----");
		System.out.println("Enter the String: ");
		String name=sc.nextLine();
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
			rev=rev+name.charAt(i);
		{
			System.out.println("---String Reverse----");
			System.out.println(rev);
		}
		//char pos=name.charAt(4);
		//System.out.println(pos);
		//System.out.println(len);

	}

}
