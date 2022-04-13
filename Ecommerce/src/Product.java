/*
 * Author:David Toribio
 * Date: 3/7/2022
 * Description: A menu driven ecommerce application where user buys a certain product out of 5 choices and 
 * decides which product to buy and adds to the total amount of all the products.
 */
public abstract class Product {
	
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	boolean buy() {
		
		if(this.quantity > 0) {
			this.quantity--;
			return true;
		}
		else {
			return false;
		}
	}
	
	abstract void getDetails();
	


}
