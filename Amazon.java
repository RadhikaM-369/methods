package com.trident.methods;

public class Amazon {
	// View product, Order, Payment, addToCart,addToWhishlist
	
	public static void viewProducts() {
		System.out.println("Phones");
		System.out.println("Gadgets");
		System.out.println("Clothes");
		System.out.println("Footwear");
		System.out.println("Jackets");
		System.out.println("Home Accessories");
		}
	public static void Order() {
		System.out.println("Order placed successfully..Thanks you");
	}
	public static void Payment() {
		System.out.println("Mode of payment: COD");
	}
	public static void addToCart() {
		System.out.println("Item is added to cart");
	}
	public static void addToWhishList() {
		System.out.println("Item is added to whishlist");
	}

	public static void main(String[] args) {
		System.out.println("--- LogIn to AMAZON ---");
		Amazon.Order();
		System.out.println("--- LogOut from AMAZON");	
		}
	}


