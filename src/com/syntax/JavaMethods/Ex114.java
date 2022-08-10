package com.syntax.JavaMethods;

public class Ex114 {

	void method1(int a, int b) {
		System.out.println("Multiplication " + (a * b));
	}

	void method2(int c, int d) {
		System.out.println("Addition " + (c + d));
	}

	void method3(int e, int f) {
		System.out.println("Subtraction " + (e - f));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex114 str = new Ex114();
		str.method2(15, 15);
		str.method1(10, 3);
		str.method3(30, 10);
	}

}
