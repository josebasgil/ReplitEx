package com.syntax.overloading;

public class Ex162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex162 obj=new Ex162();
		obj.m1();
		obj.m1(0);
	}

	static void m1() {
		System.out.println("static method without parameter");
	}
	static void m1(int a) {
		System.out.println("static method with int parameter");
	}
}
