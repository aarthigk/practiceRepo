package com.example.demo;

class GlobalBanker{
	CooperativeBank cb;
	GlobalBanker(CooperativeBank cb){
	 this.cb=cb;
	}
	
	void showGlobalBalance() {
		System.out.println("Global balance" +cb.currency);
		System.out.println(cb.swiftcode);
	}
	
}

class InterBanker{

	CooperativeBank ib;
	InterBanker(CooperativeBank ib,int bonus){
		this.ib=ib;
		this.ib.currency=ib.currency+bonus;
				}
	
	void showInterBalance() {
		System.out.println("Inter balance" +ib.currency);
		System.out.println(ib.swiftcode);
	}

}



public class CooperativeBank {
		int currency=1000;
		String swiftcode="AAC";
	
	CooperativeBank(){
		GlobalBanker gg= new GlobalBanker(this);
		gg.showGlobalBalance();
		
		InterBanker ii = new InterBanker(this, 200);
		ii.showInterBalance();
	
	}
	
	
	public static void main(String[] args) {
	
		CooperativeBank h = new CooperativeBank();
		
	}
	
}