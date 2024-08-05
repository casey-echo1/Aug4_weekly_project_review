package org.example.vending_machineV1;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) throws IllegalArgumentException {
		if(name == null || price < 0) {
			throw new IllegalArgumentException("Invalid input: either \"name\" is invalid or \"price\" is negative");
		}
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		if(name == null) throw new IllegalArgumentException("Name cannot be null");
		this.name = name;
	}
	public void setPrice(double price) {
		if(price < 0) throw new IllegalArgumentException("Price cannot be negative");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
			"name='" + name + '\'' +
			", price=" + price +
			'}';
	}
}
