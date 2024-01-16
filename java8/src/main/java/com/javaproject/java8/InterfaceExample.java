package com.javaproject.java8;

public class InterfaceExample {

	
	public static void main(String args[]) {
		
		AndroidPhone a = new AndroidPhone();
		a.call();
		a.message();
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		Phone.ring();
		
	}
}


  interface Phone{
	 
	 void call();
	 default void message() {
		 
		 System.out.println("Message Sent");
	 }
	 static void ring() {
		 System.out.println("Ringing");	 
	 }
 }
  
  class AndroidPhone implements Phone{
		
	public void call() {
		
		System.out.println("Calling");
	}	
public void message() {
		
		System.out.println("Message sent from Android");
	}
		
  }