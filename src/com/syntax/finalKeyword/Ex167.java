package com.syntax.finalKeyword;

public class Ex167 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj=new Child();
		obj.parent();
		obj.child();
	}

}

class Parent{
	static String m1="https://syntaxtechs.com";
	void parent() {
		System.out.print("["+m1+"]");
	}
	void child() {
		// TODO Auto-generated method stub
		
	}
}
class Child extends Parent{
	void child() {
		System.out.print("("+m1+"/)");
	}
}