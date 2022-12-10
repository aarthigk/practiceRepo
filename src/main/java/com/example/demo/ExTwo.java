package com.example.demo;

public class ExTwo extends ExOne {
	
	 ExTwo() {
		
		 this(5);
		System.out.println("world");

		// TODO Auto-generated constructor stub
	}
	 
	ExTwo(int x){
		this(5,10);
		System.out.println("5 times");
	}
	
	ExTwo(int x, int y){
		System.out.println(x+y);
	}
	
	public static void main(String as[]) {
		ExTwo n= new ExTwo();
		}

}
