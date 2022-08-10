package com.syntax.overloading;

public class Ex159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex159 obj=new Ex159();
		obj.method(80, 20,10,10);
		obj.method(60, 20,10);
		obj.method(60, 40);
	}

	void method(int a, int b) {
		System.out.println((a-b)+" (should come from subtracting 2 numbers)");
	}
	void method(int a, int b, int c) {
		System.out.println((a-b-c)+" (should come from subtracting 3 numbers)");
	}
	void method(int a, int b, int c, int d) {
		System.out.println((a-b-c-d)+" (should come from subtracting 4 numbers)");
	}
}
