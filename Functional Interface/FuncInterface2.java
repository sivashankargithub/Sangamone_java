package com.sangamone;
@FunctionalInterface
interface CalcHypo{
	double hypo(double a, double b);
}
public class FuncInterface2 {

	public static void main(String[] args) {
		CalcHypo calcHypo=(a,b)->(Math.pow(Math.pow(a, 2)+Math.pow(b, 2),0.5));
		double num1=7;
		double num2=24;
		double result=calcHypo.hypo(num1, num2);
		System.out.println(result);

	}

}
