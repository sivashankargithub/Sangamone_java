package com.sangamone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class S2 {
	@GetMapping("/result")
	public List loan()
	{
		List<String> name = new ArrayList<>();//name
		name.add("Mr. James");
		name.add("Mr. Peter");
		name.add("Ms. Susan");
		
		List<Integer> p_amt = new ArrayList<>();//Principal amount
		p_amt.add(10000);
		p_amt.add(8000);
		p_amt.add(5000);
		
		List<Double> years = new ArrayList<>();//time in years
	    years.add(3.0);
		years.add(2.0);
		years.add(1.5);
		
		
		List<Double> intrest = new ArrayList<>();//Interest %
		intrest.add(8.0);
		intrest.add(7.0);
		intrest.add(6.0);
		
		List<Double> intamt = new ArrayList<>();//only interest amount
		for(int i=0;i<p_amt.size();i++)
		{
			intamt.add(p_amt.get(i)*years.get(i)*intrest.get(i)/100);
		}
		
		List<Double> t_amt = new ArrayList<>();//total amount
		for(int i=0;i<p_amt.size();i++)
		{
			t_amt.add(p_amt.get(i)+intamt.get(i));
		}
		
		List<Double> emi = new ArrayList<>();
		for(int i=0;i<p_amt.size();i++)
		{
			emi.add(t_amt.get(i)/(years.get(i)*12));
		}
		
		List<Double> todig = new ArrayList<>();
		for(int i=0;i<p_amt.size();i++)
		{
			double newval=(double) Math.round(emi.get(i)*100d)/100d;
			todig.add(newval);
		}
		
		List<String> mail = new ArrayList<>();
		for(int i=0;i<p_amt.size();i++)
		{
			mail.add("Dear "+name.get(i)+",      Congrats on taking a loan of $"+p_amt.get(i)+" from Silicon Vally Bank. You will be required to pay an EMI of $"+todig.get(i)+" for the next "+(int)(years.get(i)*12)+" months.");
		}
		
		return mail;
		
	}
	
}
