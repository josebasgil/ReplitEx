package com.syntax.overriding;

public class Ex163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj1=new Parent();
		obj1.method();
		Child obj2=new Child();
		obj2.method();
		
		
	}

}
class Parent{
	void method() {
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	void method() {
		System.out.println("Child method");
	}
}