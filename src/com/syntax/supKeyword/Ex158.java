package com.syntax.supKeyword;

public class Ex158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child8 object=new Child8("Fairfax");
		object.display();
	}

}

class Parent8{
	String city;
	Parent8 (String city){
		this.city=city;
		System.out.println(city);
	}
	public void display() {
		System.out.println("City name "+city);
	}
}
class Child8 extends Parent8{
	Child8 (String city){
		super(city);
	}
}