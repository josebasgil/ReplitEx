package com.syntax.variablesJava;

public class Ex122 {
	String country;
	String capital;
	int size;

	void printInfo() {
		System.out.println("The capital of " + country + " is " + capital + " and population is " + size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex122 Object1 = new Ex122();
		Ex122 Object2 = new Ex122();
		Object1.country = "USA";
		Object1.capital = "Washington DC";
		Object1.size = 330000000;
		Object2.country = "Kazakhstan";
		Object2.capital = "Astana";
		Object2.size = 18500000;
		Object1.printInfo();
		Object2.printInfo();
	}

}
