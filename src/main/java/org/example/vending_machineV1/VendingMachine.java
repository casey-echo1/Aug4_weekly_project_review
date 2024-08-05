package org.example.vending_machineV1;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine<T extends Product> {
	private Map<String, Slot<? extends Product>> slots = new HashMap<>();

	public VendingMachine() {}

	public void addProduct(String code, Slot<T> slot) {
		slots.put(code, slot);
	}

	public void dispenseProduct(String code) {
		if(slots.containsKey(code)) {
			Slot<? extends Product> slot = slots.get(code);
			if(slot.getQuantity() > 0) {
				slot.decrementQuantity();
				System.out.println("Dispensing " + slot.getProduct().getName());
			} else {
				System.out.println("Sorry, product is out of stock");
			}
		}
	}
	public void displayProducts() {
		for(Map.Entry<String, Slot<? extends Product>> entry : slots.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().getProduct().getName());
		}
	}

}
