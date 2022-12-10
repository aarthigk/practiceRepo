package com.example.demo;

public class ExThree {
	
	public   int age = 0;
	public String name;

	ExThree(String name, int age){
		this.name=name;
		this.age=age;
	}

	ExThree(ExThree ee){
		name=ee.name;
		age=ee.age;
		
		
	}
	
	public static void main(String as[]) {
		ExThree aa=new ExThree("ar",1);
		ExThree a1=new ExThree(aa);
	}
}
