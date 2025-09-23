package com.tnsif.interfaces;

interface Phone {
void call();
void sms();
}

class Samsung implements Phone {
public void call() {
   System.out.println("Samsung: Making a call...");
}
public void sms() {
   System.out.println("Samsung: Sending an SMS...");
}
}

class Jio implements Phone {
public void call() {
   System.out.println("Jio: Making a call...");
}
public void sms() {
   System.out.println("Jio: Sending an SMS...");
}
}

public class InterfacePhoneExample {

	public static void main(String[] args) {
		  Phone p1 = new Samsung(); 
		     p1.call();
		     p1.sms();

		     System.out.println("-----------------");

		     Phone p2 = new Jio();       
		     p2.call();
		     p2.sms();
	}
}