package com.trident.methods;

public class TollGate {
	public static void Open() {
		System.out.println("Toll gate is open");
	}
	public static void Closed() {
		System.out.println("Toll gate is closed, Please wait..");
	}
	public static void PayToll() {
		System.out.println("Pay the amount and collect the reciept.. Thank you");
	}

	public static void main(String[] args) {
		System.out.println("Enter---");
		TollGate.Closed();
		TollGate.Open();
		TollGate.PayToll();
	}
}
