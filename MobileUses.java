package com.trident.methods;

public class MobileUses {
public static void calls() {
	System.out.println("Can check call log");
}
public static void messages() {
	System.out.println("msg sent successfully");
}
public static void camera() {
	System.out.println("Click here to capture picture");
}
public static void Browse() {
	System.out.println("you can browse here..");
}
public static void ListenSongs() {
	System.out.println("Play songs...");
}
	public static void main(String[] args) {
		System.out.println("Unlock Mobile");
		MobileUses.Browse();
		System.out.println("lock Mobile");

	}

}
