package com.syntax.supKeyword;

public class Ex157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child7 object=new Child7();
		object.m2();
	}

}
class Parent7{
	void m1() {
		System.out.println("m1 method in parent class");
	}
}
class Child7 extends Parent7{
	void m1() {
		System.out.println("m1 method in child class");
	}
	void m2() {
		m1();
		super.m1();
	}
}