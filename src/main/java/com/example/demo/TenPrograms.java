package com.example.demo;

public class TenPrograms {
   
	static void FirstPallindrome() {
		int num=2152;
		int remainder=0;
		int sum=0;
		int temp;
		temp=num;
		
		while (num >0) {
			 remainder = num%10;
			 System.out.println("yes"+ remainder);
			 sum =(sum*10)+remainder;
			 System.out.println("ok"+ sum);
			 num = num/10;
			
		}
		if (temp ==sum) {
			System.out.println("plaindor");
		}
		else {
			System.out.println("Not plaindor");
			
		}
	}
	
	static void divisor() {
		double i =1235;
		double j=2;
		double quotient=i/j;
		double remaine=i%j;
		
		System.out.println(quotient);
		System.out.println(remaine);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	FirstPallindrome();
		divisor();
	}

}
