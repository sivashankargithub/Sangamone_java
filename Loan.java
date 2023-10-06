package sangamone_pack;

import java.util.ArrayList;
import java.util.List;

public class Loan {

	public static void main(String[] args) {
		loan1();
	}
	public static void loan1()
	{
		int i;
		List<String> name=new ArrayList<>();
		name.add("Mr. James");
		name.add("Mr. Peter");
		name.add("Ms. Susan");
		
		List<Integer> p_amt=new ArrayList<>();//principal amount
		p_amt.add(10000);
		p_amt.add(8000);
		p_amt.add(5000);
		
		List<Double> years=new ArrayList<>();//years
		years.add(3.0);
		years.add(2.0);
		years.add(1.5);
		
		List<Double> r_int=new ArrayList<>();//rate of interest
		r_int.add(8.0);
		r_int.add(7.0);
		r_int.add(6.0);
		
		List<Double> t_int=new ArrayList<>();//total interest
		for(i=0;i<name.size();i++)
		{
			double total_int = p_amt.get(i)*years.get(i)*r_int.get(i)/100;
			t_int.add(total_int);
			
		}
		//System.out.println(t_int);
		
		List<Double>t_amt=new ArrayList<>();//total amount to be pay
		for(i=0;i<name.size();i++)
		{
			double total_amt = p_amt.get(i)+t_int.get(i); 
			t_amt.add(total_amt);
		}
		//System.out.println(t_amt);
		
		List<Double>emi1=new ArrayList<>();//emi per month
		for(i=0;i<name.size();i++)
		{
			double emi_amt = t_amt.get(i)/(years.get(i)*12);
			emi1.add(emi_amt);
		}
		//System.out.println(emi1);
		
		List<Double> emi2=new ArrayList<>();// converting emi per month with 2 digit decimal 
		for(i=0;i<name.size();i++)
		{
			double emitwo=(double)Math.round(emi1.get(i)*100d)/100d;
			emi2.add(emitwo);
		}
		//System.out.println(emi2);
		
		for(i=0;i<name.size();i++)
		{
			System.out.println("Dear "+name.get(i)+",\n      Congrats on taking a loan of $"+p_amt.get(i)+" from Silicon Vally Bank. You will be required to pay an EMI of $"+emi2.get(i)+" for the next "+(int)(years.get(i)*12)+" months."+"\n\nThanks & Regards \nSilicon Vally Bank");
			System.out.println();
		}
	}

}
