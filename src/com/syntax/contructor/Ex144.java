package com.syntax.contructor;

public class Ex144 {

	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;
	
	Ex144(String label, double price, String category, boolean hasExpiration, int stock){
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		this.stock=stock;			
	}
	Ex144(String label, double price, int stock){
		this.label=label;
		this.price=price;
		category="misc";
		hasExpiration=false;
		this.stock=stock;			
	}
	Ex144(String label, double price){
		this.label=label;
		this.price=price;
		category="null";
		hasExpiration=false;
		stock=0;				
	}
	void printInfo() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex144 obj1=new Ex144("Eggs", 3, "Produce", true, 10);
		Ex144 obj2=new Ex144("Paper Towels", 2, 24);
		Ex144 obj3=new Ex144("Paper Towels", 2);
		obj1.printInfo();
		obj2.printInfo();
		obj3.printInfo();
	}

}
