package com.example.demo;

import java.util.Arrays;

public class TestScienceClass{
	
	public String studentRepName="Aabc";
	
	public  String studentName;
	public  int   studentNumber;
	
	public TestScienceClass(String name,int number) {
		studentName=name;
		studentNumber=number;
	//	System.out.println(this + "in constructor");
	}



//	public void printMsg (){
//		System.out.println(this + "in Method");
//		System.out.print(studentName);
//		System.out.print(studentNumber);	
//	}
//	
	public String toString() {
//	//	System.out.println(this + "in String Method");
		return studentName+ "" + ""+studentNumber;
//		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestScienceClass a= new TestScienceClass("art", 1);
	//	TestScienceClass[] m= new TestScienceClass[2];
		
//	
//		m[0] =new TestScienceClass("Aa",1);
//		m[1] =new TestScienceClass("Ba",2);
		
		System.out.println(a);

	}}


