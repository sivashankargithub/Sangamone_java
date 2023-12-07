package com.sangamone;

public class Greeting {
	public static String greeting() {
		return "Hello Guest";
	}
	public static String greeting(String name) {
		return "Hello "+name; 
	}
	public static String greeting(String name, String gender) {
		//System.out.println(name);
		//System.out.println(gender);
		if(gender.equals("M") || gender.equals("male") || gender.equals("m") ||gender.equals("Male") || gender.equals("MALE")) {
			return "Hello Mr. "+name;
		}
		if(gender.equals("F")||gender.equals("f")||gender.equals("female")||gender.equals("Female")||gender.equals("Female")) {
			return "Hello Ms. "+name;
		}
		else {
			return "Please mention gender correctly";
		}
	}

	public static void main(String[] args) {
		System.out.println(greeting());
		System.out.println(greeting("Siva"));
		System.out.println(greeting("Rama","M"));
		System.out.println(greeting("Sita","F"));
		System.out.println(greeting("Sita","S"));
	}

}
