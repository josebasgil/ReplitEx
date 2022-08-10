package com.syntax.Interface;

public class Ex175 implements SecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondInterface obj=new Ex175();
		obj.firstMethod();
		obj.secondMethod();
	}

	@Override
	public void firstMethod() {
		// TODO Auto-generated method stub
		System.out.println("First Method implementing multiple Inheritance");
	}

	@Override
	public void secondMethod() {
		// TODO Auto-generated method stub
		System.out.println("Second Method implementing multiple Inheritance");
	}

}

interface FirstInterface{
	void firstMethod();
}

interface SecondInterface extends FirstInterface{
	void secondMethod();
}