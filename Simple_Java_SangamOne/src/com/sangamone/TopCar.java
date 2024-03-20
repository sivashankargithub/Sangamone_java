package com.sangamone;

public enum TopCar {
	TATA("TATA Safari","Rs. 27.34L"),ROLLS_ROYCE("La Rose Noire Droptail","Rs. 211Cr"),HONDA("City Hybrid","Rs. 20.39 L"),MARUTI("Maruti Suzuki Invicto","28.42L"),TESLA("Tesla X Plaid","$ 119,990");
	private String model;
	private String price;
	private TopCar(String model, String price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public String getPrice() {
		return price;
	}
	public static void main(String[] args) {
		TopCar car=TopCar.TATA;
		System.out.println(car.getModel());
		System.out.println(car.getPrice());
		TopCar[] topCar2=TopCar.values();
		for(TopCar c:topCar2) {
			System.out.println(c);
			System.out.println(c.getModel()+" : "+c.getPrice());
		}
	}
}