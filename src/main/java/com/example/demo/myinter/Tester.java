package com.example.demo.myinter;

public class Tester extends Actions implements pageDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
Tester n = new Tester();
n.starter();
n.addnumber();

	}

	@Override
	public void addnumber() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void starter() {
		// TODO Auto-generated method stub
		System.out.println("you have to redefine");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

}
