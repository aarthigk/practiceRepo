package com.example.demo;

public class ExFour {
	String message="Hello";



	void printTwo(ExFour as) {
		System.out.println("message");

	}
	void print() {
		printTwo(this);
				
	}
	

	public static void main(String aer[]) {
		ExFour g= new ExFour(); 	
		//System.out.println(g.message);
		g.print();
		}

}
