package com.sangamone;

public class S1 {

	public static void main(String[] args) {
		System.out.println(Suit.HEART.getSymbol());
		System.out.println(Suit.DIAMOND.getSymbol());
		System.out.println(Suit.CLUB.getSymbol());
		System.out.println(Suit.SPADE.getSymbol());
		System.out.println(Suit.valueOf("SPADE").getSymbol());
		System.out.println(Suit.HEART.ordinal());
		System.out.println(Suit.DIAMOND.getLetter());
	}

}
