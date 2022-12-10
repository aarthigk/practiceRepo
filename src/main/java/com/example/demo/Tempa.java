package com.example.demo;


public class Tempa{

	
	public Tempa() {
		 this(5);
		 System.out.println("The Default constructor");
	}
	public Tempa(int x) {
		this(5,15);
	}
	
	public Tempa(int x,int y) {
	
		System.out.println(x*y);
	}
//	public static void main (String aa[]) {
//		new Tempa();
//		
//		new Tempa(4,8);
//	}
//	
	
}