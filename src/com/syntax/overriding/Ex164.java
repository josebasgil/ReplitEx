package com.syntax.overriding;

public class Ex164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent1 [] arr= {new Child1(),new Child2(),new Child3()};
		for (Parent1 parent:arr) {
			parent.hello();
		}
	}

}
class Parent1{
	void hello() {
		System.out.println("method in Parent class");
	}
}
class Child1 extends Parent1{
	void hello() {
		System.out.println("method in Child1 class");
	}
}
class Child2 extends Parent1{
	void hello() {
		System.out.println("method in Child2 class");
	}
}
class Child3 extends Parent1{
	void hello() {
		System.out.println("method in Child3 class");
	}
}