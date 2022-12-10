package com.example.demo;

public class Application {

	public static void main(String a[]) {
		ContractDemo ar = new Implementation();
		printDemo(ar);
		
		Room ItcHotel = new Room("SingleRoom",100,100);
		Room HolidayInn = new Room("DoubleRoom",300,200);
		Room Hilton=new Room("KingSizeRoom",400,300);
		
	double totalexpense =getTotalCost(ItcHotel,HolidayInn,Hilton);
	
	System.out.println(totalexpense);
		
			
		}

	private static double getTotalCost(Room room1, Room room2, Room room3) {
		// TODO Auto-generated method stub
		return room1.getCost()+room2.getCost()+room3.getCost();
	}

	private static void printDemo(ContractDemo ar) {
		
		// TODO Auto-generated method stub
	ar.extendedContract();
	ar.term1();
	ar.term2();
	}
		
		
	}


