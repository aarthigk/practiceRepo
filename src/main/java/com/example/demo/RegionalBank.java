package com.example.demo;

//1. two variable having same name
//2. invoke class and variable


class Banks{
	int total;
	Banks(int total){
		total=total;
	}
	void displayAll(int total) {
		
		System.out.println(total);
	}
	void displayAlla(int total) {
		
		System.out.println(total);
	}
	
}



class NationalBank{
	RegionalBank bankObj;
	
	NationalBank(RegionalBank bankObj){
		this.bankObj=bankObj;
		
	}
	void displayBankMoney() {
		System.out.println("Bank's maintained balance " + bankObj.currency);
		System.out.println("Bank's unique code "+ bankObj.swiftCode);
	}
}

class InterBank{
	RegionalBank bankObj;
	InterBank(RegionalBank bankObj,int bonus){
		this.bankObj=bankObj;
		this.bankObj.currency=bankObj.currency+bonus;
		
	}
	void displayBankMoney() {	
		System.out.println("Bank's maintained balance plus bonus " + bankObj.currency);
		System.out.println("Bank's unique code "+ bankObj.swiftCode);
		
	}
	
}

public class RegionalBank {
	long currency=1000;
	String swiftCode="WWWCC";
	int bonus=100;
	RegionalBank(){
		NationalBank g= new NationalBank(this);
		g.displayBankMoney();
		
		InterBank gg= new InterBank(this,100);
		gg.displayBankMoney();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegionalBank n = new RegionalBank();
		Banks na = new Banks(5);	
	}

}
