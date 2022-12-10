package com.example.demo;

public class Room {
	String name;
	int size;


	double cost;
	
	public Room(String name ,int size , double cost) {
	this.name=name;
	this.size=size;
	this.cost=cost;
	}
	
	public String getName(String name) {
	 return name;
	}
	
	private void setName(String name) {
		this.name =name;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	

}
