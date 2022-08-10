package com.syntax.Interface;

public class Ex177 implements Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj=new Ex177();
		obj.adding(100,20);
		obj.substracting(100,20);
		obj.multiply(100,20);
		obj.dividing(100,20);
	}

	@Override
	public void display(double number1, double number2) {
		// TODO Auto-generated method stub
		number1=100;
		number2=20;
	}

	@Override
	public void adding(double number1, double number2) {
		// TODO Auto-generated method stub
		System.out.println("Result is ::: "+(number1+number2));
	}

	@Override
	public void substracting(double number1, double number2) {
		// TODO Auto-generated method stub
		System.out.println("Result is ::: "+(number1-number2));
	}

	@Override
	public void multiply(double number1, double number2) {
		// TODO Auto-generated method stub
		System.out.println("Result is ::: "+(number1*number2));
	}

	@Override
	public void dividing(double number1, double number2) {
		// TODO Auto-generated method stub
		System.out.println("Result is ::: "+(number1/number2));
	}

}

interface Outputs{
	void display(double number1, double number2);
}

interface Functions extends Outputs{
	void adding(double number1, double number2);
	void substracting(double number1, double number2);
	void multiply(double number1, double number2);
	void dividing(double number1, double number2);
}