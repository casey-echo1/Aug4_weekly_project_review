package org.example.vending_machineV1;

public class VendRunner {
	public static void main(String[] args) {
		Snack snack1 = new Snack("Three Musketeers", 5, true);
		Beverage beverage1 = new Beverage("Coke", 2.00, 12);
		Slot slot1 = new Slot(snack1, 3);
		Slot slot2 = new Slot(beverage1, 1);

		VendingMachine vend1 = new VendingMachine();
		vend1.addProduct("F3", slot1);
		vend1.addProduct("F4", slot2);
		vend1.displayProducts();

		vend1.dispenseProduct("F4");
		vend1.dispenseProduct("F4");

		//empty name
		//Snack snack2 = new Snack("", 5, true);
		// negative price
		//Beverage beverage2 = new Beverage("Coke", -2.00, 12);
		//flOunces negative
		//Beverage beverage3 = new Beverage("Coke", 1.00, -12);
		//quantity is negative
		//Slot slot4 = new Slot(snack1, -2);
		// product is null
		//Slot slot3 = new Slot(null, 3);
		//code is empty or null
		vend1.dispenseProduct(null);

	}
}
