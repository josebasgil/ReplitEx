package com.syntax.Interface;

public class Ex174 implements MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface obj1=new Ex174();
		obj1.method1();
		obj1.method2();
		
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implementation of method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implementation of method2");
	}

}

interface MyInterface{
	void method1(); 
	void method2();
}
