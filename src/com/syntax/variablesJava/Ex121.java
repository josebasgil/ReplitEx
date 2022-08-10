package com.syntax.variablesJava;

public class Ex121 {

	int integer;
	double doubles;
	char chars;

	void printInfo() {
		System.out.println(integer);
		System.out.println(doubles);
		System.out.println(chars);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex121 instance1 = new Ex121();
		Ex121 instance2 = new Ex121();
		instance1.integer = 10;
		instance1.doubles = 10.23;
		instance1.chars = 'a';
		instance2.integer = 100;
		instance2.doubles = 100.23;
		instance2.chars = 's';
		instance1.printInfo();
		instance2.printInfo();
	}

}
