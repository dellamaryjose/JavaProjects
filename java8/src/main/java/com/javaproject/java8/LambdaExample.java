package com.javaproject.java8;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = () ->System.out.println("Message");
		a.print();

	}

}
interface A{
	
	public void print();
}
