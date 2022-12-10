package com.example.demo.myinter;

public interface pageDesign {
	
	default void print (){
		System.out.println("welcome");
	}
	
	static void land() {
		System.out.println("Landing welcome");
	}
	
	void addnumber();
	
	public void starter() ;
}
