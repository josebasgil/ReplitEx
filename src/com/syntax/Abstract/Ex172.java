package com.syntax.Abstract;

public class Ex172 extends Padre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex172 obj=new Ex172();
		obj.m2(null);
		obj.m1();
	}

	 @Override
		void m2(String a) {
			// TODO Auto-generated method stub
			System.out.println("Child class providing implementation");
		}

		@Override
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("Parent class providing implementation");
		}
}

abstract class Padre{
	abstract void m2(String a);
	abstract void m1();
}