package com.sangamone;

import java.io.Serializable;
import java.util.Scanner;

public enum Colors implements Serializable{
	BLACK("#000000"),RED("#FF0000"),GREEN("#008000"),BLUE("#008000"),ORANGE("#FFA500"),VIOLET("#8F00FF"),WHITE("#FFFFFF"),PINK("#FFC0CB"),YELLOW("#FFFF00");
	private String code;
	private Colors(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String toString() {
		return code;
	}
	public static void main(String[] args) {
		Colors colors=Colors.PINK;
		System.out.println(colors);
		System.out.println(Colors.PINK.ordinal());
		System.out.println(Colors.BLACK.getCode());
		System.out.println(Colors.BLUE.getCode());
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter color to get code :");
		String color=sc1.next();
		System.out.println(Colors.valueOf(color.toUpperCase()).getCode());
	}
}
