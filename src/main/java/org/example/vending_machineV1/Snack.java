package org.example.vending_machineV1;

public class Snack extends Product {
	private boolean isVegan = true;

	public Snack(String name, double price, boolean isVegan) {
		super(name, price);
		this.isVegan = isVegan;
	}
	public boolean getVeganStatus() {
		return isVegan;
	}
	public void setVeganStatus(boolean isVegan) {
		this.isVegan = isVegan;
	}

	@Override
	public String toString() {
		return "Snack{" +
			"productName=" + super.getName() +
			", price=" + super.getPrice() +
			", isVegan=" + isVegan +
			'}';
	}
}
