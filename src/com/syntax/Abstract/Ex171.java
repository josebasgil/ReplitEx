package com.syntax.Abstract;

public class Ex171 extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex171 obj=new Ex171();
		obj.m1();
		obj.m1(null);
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 without parameters");
	}

	@Override
	void m1(String a) {
		// TODO Auto-generated method stub
		System.out.println("m1 method with parameter");
	}

}

abstract class Parent{
	abstract void m1();
	abstract void m1(String a);
}

