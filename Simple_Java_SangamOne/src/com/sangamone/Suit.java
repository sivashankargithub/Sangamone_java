package com.sangamone;

public enum Suit {	
	HEART('♥'),CLUB('♣'),DIAMOND('♦'),SPADE('♠');
	private char symbol;
	private char letter;
	public char getSymbol() {
		return symbol;
	}
	public char getLetter() {
		return letter;
	}
	private Suit(char symbol) {
		this.symbol = symbol;
		this.letter = switch (symbol) {
		case '♥' -> 'H';
		case '♣' -> 'C';
		case '♦' -> 'D';
		case '♠' -> 'S';
		default -> throw new RuntimeException("Illegal:" + symbol);
		};
	}
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