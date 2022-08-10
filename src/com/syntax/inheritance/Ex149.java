package com.syntax.inheritance;

public class Ex149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B object=new B();
		object.classA();
		object.classB();
	}

}

class A {

	void classA() {
		System.out.println("Class A");
	}

}

class B extends A{
	void classB() {
		System.out.println("Class B");
	}
}
