package com.example.demo;

class Chef{
	public void TodaysMenu() {
		System.out.println("Menu from the chef\n" + "1. soups \n" + "2. passteries \n" );
	}

	public void getCakeOrder(String topping) {
	System.out.println("Christmas Cake with " + topping+ " Need cutlery "+ addCutlery());
		
	}
	
	public boolean addCutlery() {
		return false ;
	}			
}

class Orders extends Chef{
	public void TodaysMenu() {
		System.out.println("Menu from the waiter\n" + "1. soups \n" + "2. passteries \n" ); // override
	}

	public void getCakeOrder(String topping , String cherry) {
	System.out.println("Christmas Cake with " + topping+ " Need cutlery "+ addCutlery() + "" + cherry);
		
	}
	
	public boolean addCutlery() {
		return true ;
	}	
	
}

public class Restaurant{
	public static void main(String ars[]) {
		Orders as = new Orders();
		as.TodaysMenu();
		as.getCakeOrder("Extra cream");
		as.getCakeOrder(" extra vanilla", " extra cherry");

	}}
	
