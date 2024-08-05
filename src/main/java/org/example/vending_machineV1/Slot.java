package org.example.vending_machineV1;

public class Slot<T extends Product> {
	private T product;
	private int quantity;

	public Slot(T product, int quantity) {
		if(product == null) throw new IllegalArgumentException("You must enter a valid product.");
		if(quantity < 0) throw new IllegalArgumentException("Quantity can not be negative.");
		this.product = product;
		this.quantity = quantity;
	}
	public void decrementQuantity() {
		if (quantity > 0) quantity--;
	}
	public T getProduct() {
		if(product == null) throw new IllegalArgumentException("You must enter a valid product.");
		return product;
	}

	public void setProduct(T product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) throw new IllegalArgumentException("Quantity can not be negative.");
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Slot{" +
			"product=" + product.getName() +
			", price=" + product.getPrice() +
			", quantity=" + quantity +
			'}';
	}
}
