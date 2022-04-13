/*
 * Author:David Toribio
 * Date: 3/7/2022
 * Description: A menu driven ecommerce application where user buys a certain product out of 5 choices and 
 * decides which product to buy and adds to the total amount of all the products.
 */

import java.util.Scanner;

//shop class
public class Shop {
	 
	static Product[] inventory = new Product[5];
	  
	static double totalAmount = 0;
	
	static void displayMenu() {
		
		System.out.println("\nEnter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
		for(int i = 0; i<= inventory.length - 1; i++) {
			
			System.out.println(i + " : " + inventory[i].getName());
		}
	}
	
	public static void main(String[] args) {
		
		   inventory[0] = new Apparel ("Business Ritual Womens Long Sleeve Top", 65.39, 4, 'L', "Blue");
		   inventory[1] = new Book ("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth");
		   inventory[2] = new Apparel("Men’s Business Casual Shirt", 57.10,2, 'M', "Teal");
		   inventory[3] = new Bath("Organic Turmeric Soap", 11.25, 1);
		   inventory[4] = new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman");
		   
		
		
		int userInput;
		Scanner input = new Scanner(System.in);
		
		do {
			
			displayMenu();
			userInput = input.nextInt();
			
			if(userInput >=0 && userInput <=4) {
				
				if(inventory[userInput].buy()) {
					
					System.out.println("Your purchase was successful");
					totalAmount += inventory[userInput].getPrice();
				}
				
				else {
					System.out.println("Sorry! This product is out of stock.");
				}
			}
			
		} while(userInput >=0 && userInput <=4);
		
		System.out.println("Thank you for shopping with us! The total amount is "  + totalAmount);
		
		
		
		input.close();
	}
}
