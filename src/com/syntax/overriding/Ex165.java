package com.syntax.overriding;

public class Ex165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childx obj=new Childx();
		obj.method1();
		obj.method2();
		obj.method3();
		
	}

}
class Parent2{
	public void method1() {
		System.out.println("I am parent public/protected/default/private method");
	}
	protected void method2() {
		System.out.println("I am parent public/protected/default/private method");
	}
	void method3() {
		System.out.println("I am parent public/protected/default/private method");
	}
	private void method4() {
		System.out.println("I am parent public/protected/default/private method");
	}
}
class Childx extends Parent2{
	public void method1() {
		System.out.println("I am child public method");
	}
	protected void method2() {
		System.out.println("I am child protected method");
	}
	void method3() {
		System.out.println("I am child default method");
	}
	private void method4() {
		System.out.println("I am child private method");
	}
}