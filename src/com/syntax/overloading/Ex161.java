package com.syntax.overloading;

public class Ex161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex161 obj=new Ex161();
		obj.m1(null);
		obj.m1(0);

	}

	private void m1(String a) {
		System.out.println("private m1 method");
	}
	private void m1(int a) {
		System.out.println("private m1 method with int parameter");
	}
}
