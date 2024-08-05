package org.example.vending_machineV1;

public class Beverage extends Product {
	private double flOunces;

	public Beverage(String name, double price, double flOunces) {
		super(name, price);
		this.flOunces = flOunces;
	}
	public double getFlOunces() {
		return flOunces;
	}
	public void setFlOunces(double flOunces) {
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
