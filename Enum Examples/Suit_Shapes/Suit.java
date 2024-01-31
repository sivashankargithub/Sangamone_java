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
}