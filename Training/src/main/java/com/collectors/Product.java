package main.java.com.collectors;

public class Product {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int quantity;
	private int price;
	public Product(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	

}
