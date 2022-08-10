package com.syntax.contructor;

public class Ex143 {

	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	Ex143(String make, String model, int numberOfDoors, int topSpeed, double price){
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	
	Ex143(String make, String model, int topSpeed, double price){
		this.make=make;
		this.model=model;
		numberOfDoors=4;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	
	Ex143(int numberOfDoors, int topSpeed, double price){
		make="unknown";
		model="unknown";
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	
	Ex143(String make, String model, int numberOfDoors){
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		topSpeed=90;
		price=0;
	}
	
	void printInfo() {
	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex143 car1=new Ex143("Toyota","Prius",4,120,30000);
		Ex143 car2=new Ex143("Toyota","Prius",120,30000);
		Ex143 car3=new Ex143(4,120,30000);
		Ex143 car4=new Ex143("Toyota","Prius",4);
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
		car4.printInfo();
	}

}
