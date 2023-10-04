package sangamone_pack;

import java.util.ArrayList;
import java.util.List;

public class Random_otp_2 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		int otpsize=8;
		double rand1=0.0;
		double  rand2=0.0;
		int rand3=0;
		for(int i=0;i<10;i++)
		{
			rand1=Math.random();
			rand2=rand1*Math.pow(10, otpsize);
			rand3=(int)rand2;
			list1.add(rand3);
			
			if(list1.get(i)>=Math.pow(10,otpsize-1))
			{
				list2.add(list1.get(i));
				System.out.println(list1.get(i));
			}	
		}
		int len2=list2.size();
		System.out.println();
		System.out.println(len2);
		System.out.println();
		for(int i=0;i<len2;i++)
		{
			System.out.println(list2.get(i));
		}
	}

}
