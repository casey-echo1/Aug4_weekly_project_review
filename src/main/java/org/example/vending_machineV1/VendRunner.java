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

	}
}
