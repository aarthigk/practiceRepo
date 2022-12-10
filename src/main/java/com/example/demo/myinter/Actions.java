package com.example.demo.myinter;

public abstract class Actions {

	public void click() {
		System.out.println("click");
	}
	

	public abstract void start() ;
	
	public void end() {
		System.out.println("click end");
	}
	
	static void getName() {
		
		System.out.println("the name");
	
		
	}

}