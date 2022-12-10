package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RoomService {
	
	//1. declaire a collection to store room inverntot
	Collection<Room> inventory = new ArrayList<>();
	//Room A,B,C;
	
	
	
	public RoomService() {
	//2.initial collection and assign to inverntory
//	this.A=new Room("Ahotel",20,100);
//	this.B=new Room("BHotel",30,105);
//	this.C=new Room("CHotel",40,300);
//	
//	this.ar.addAll(Arrays.asList(A,B,C));	
		
		this.inventory=new HashSet<>();
	
	}
	
	public Collection<Room> getInventory() {
		
	//3.return the room inventory
	
	return new HashSet<>(this.inventory);
	}

	
	public void createRoom(String name,int size,double cost) {
		
		
		this.inventory.add(new Room(name,size,cost));
	
	//4. add a room to roo inventory using provide parameters
		
	}
	
	public void createRooms(Room[] rooms) {
	//5. add rooms provided in array to the room inventroy
		
		this.inventory.addAll(Arrays.asList(rooms));
}
	
	//6.Remove the prvide room from the inventory room
	public void removeRoom(Room room) {
		this.inventory.remove(room);
	}
	
}