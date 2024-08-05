package org.example.vending_machineV1;

public class Beverage extends Product {
	private double flOunces;

	public Beverage(String name, double price, double flOunces) {
		super(name, price);
		this.flOunces = flOunces;
		if(flOunces < 0) throw new IllegalArgumentException("flOunces must be a positive number");
	}
	public double getFlOunces() {
		return flOunces;
	}
	public void setFlOunces(double flOunces) {
		if(flOunces < 0) throw new IllegalArgumentException("FlOunces cannot be negative");
		this.flOunces = flOunces;
	}

	@Override
	public String toString() {
		return "Beverage{" +
			", productName=" + super.getName() +
			", price=" + super.getPrice() +
			", flOunces=" + flOunces +
			'}';
	}
}
