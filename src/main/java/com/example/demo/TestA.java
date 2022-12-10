package com.example.demo;


class TestParent{
	TestParent(int a){
		System.out.println("Helloworld");
	}
	
}

public class TestA extends TestParent{
	int age;
	
	TestA(){

		super(5);
	}
	


	
	
	
	 
	public static void main(String[] args) {
			
		TestA fa = new TestA();
		
	
	
	}

}
