package com.syntax.supKeyword;

public class Ex155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
	}

}

class A{
	A(){
		System.out.println("I");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("am");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("a tester");
	}
}