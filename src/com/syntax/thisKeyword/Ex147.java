package com.syntax.thisKeyword;

public class Ex147 {

	String model;
	double price;
	int quantity;
	
	Ex147 (String model, double price, int quantity){
		this.model=model;
		this.price=price;
		this.quantity=quantity;
	}
	
	void carStockValue () {
		Double stockValue=(Double.valueOf(quantity))*price;
		System.out.println(model+" Stock Value "+stockValue);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex147 car1=new Ex147("Toyota 2019", 25000, 100);
		Ex147 car2=new Ex147("BMW 2019", 65298, 10);
		car1.carStockValue();
		car2.carStockValue();
	}

}
