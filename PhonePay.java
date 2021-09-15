package com.trident.methods;

public class PhonePay {

	public static void transferMoney() {
		System.out.println("Money transfered successfully");
	}
	public static void rechargeMobile() {
		System.out.println("Mobile recharge successfully");
	}
	public static void electricityBill() {
		System.out.println(" Electricity bill paid");
	}
	public static void rechargeDTH() {
		System.out.println("DTH recharge done..");
	}
	public static void main(String[] args) {
		System.out.println("Login into PhonePay");
		PhonePay.transferMoney();
		PhonePay.electricityBill();
		PhonePay.rechargeMobile();
		PhonePay.rechargeDTH();
		System.out.println("Log out from PhonePay");
		
	}

}
