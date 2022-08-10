package com.syntax.Interface;

public class Ex176 implements ChildInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInterface obj=new Ex176();
		obj.parentMethod();
		obj.childMethod();
	}

	@Override
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("Parent Method-welcome to Syntax");
	}

	@Override
	public void childMethod() {
		// TODO Auto-generated method stub
		System.out.println("Child Method-hello Syntax");
	}

}

interface ParentInterface{
	void parentMethod();
}

interface ChildInterface extends ParentInterface{
	void childMethod();
}
