package com.example.demo.myinter;

import java.util.Objects;

/*1.use constrcutor
 * 2.methods
 * 3.Object[] refer== initialise the value
 * 
 * */
public class ShoppingCart {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objs = {"Mobile", new Integer(1), "Charger", new Integer(2),"pendrive", new Integer(3)};
	
	for (Object j : objs) {
		
		System.out.println(j);
	}
		

	}
}

