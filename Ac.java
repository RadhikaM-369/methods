package com.trident.methods;

public class Ac {
	public static void On()
	{ System.out.println("AC is ON");}
	
	public static void Off()
	{ System.out.println("Turn OFF the AC");}
	
	public static void Temp()
	{ System.out.println("You can increase or decrease the temperature");}

	public static void main(String[] args) {
		System.out.println("AC functions");
		Ac.On();
		Ac.Temp();
		}

}
