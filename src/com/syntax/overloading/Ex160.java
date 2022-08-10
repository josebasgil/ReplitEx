package com.syntax.overloading;

public class Ex160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex160 obj=new Ex160();
		obj.method(100);
		obj.method("Syntax Technologies");
		obj.method(100.09);
	}

	void method(int a) {
		System.out.println(a);
	}
	void method(String a) {
		System.out.println(a);
	}
	void method(double a) {
		System.out.println(a);
	}
}
