package com.sangamone;
@FunctionalInterface
interface Ifcalc1{
	int add(int a, int b);
}
public class FuncInterface1 {

	public static void main(String[] args) {
		Ifcalc1 ifcalc1=(a,b)->(a+b);
		int num1=8;
		int num2=4;
		int result=ifcalc1.add(num1, num2);
		System.out.println(result);

	}

}
