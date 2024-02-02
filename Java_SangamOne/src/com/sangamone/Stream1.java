package com.sangamone;

class Outer1{
	private int n1=7;
	private int n2=14;
	public int mo1() {
		return n1*n2;
	}
	class Inner1{
		public Outer1 mi1() {
			System.out.println(n1+n2);
			return mi1();
		}
	}
}
public class Stream1 {

	public static void main(String[] args) {
		Outer1 o=new Outer1();
		Outer1.Inner1 oi=new o.Inner();
		

	}

}
