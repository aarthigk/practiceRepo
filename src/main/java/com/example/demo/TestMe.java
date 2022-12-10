package com.example.demo;

public class TestMe {
	
	String name;
	int age;
	String commonName="student";
	
	public TestMe() {
	}
	
	public TestMe(String commonName) {
		commonName=this.commonName;
		System.out.println(commonName);
	}
	
	public TestMe(String name,int age) {
	    this.name=name;
		this.age=age;
		System.out.println(name +"  "+ age);
		
	}
	
	public TestMe( TestMe t) {
		name=t.name;
		age=t.age;
	}
	
	public String toString() {
		
		
		return name + ""+"" +age;
	}
	
	public static void main(String ar[]) {
	TestMe nm= new TestMe("aar" , 1 );
	
	
	System.out.println(nm);
	
	TestMe m =new TestMe(nm);
	System.out.println(m);
	
	}

}
