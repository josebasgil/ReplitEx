package com.syntax.supKeyword;

public class Ex152 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child childs=new Child("Vienna");
	}
}

class Parent {
	Parent (String city){
		System.out.println(city);
	}
	
	Parent (){
		System.out.println("Parent Constructor");		
	}
}

class Child extends Parent {
	Child (String city){
		super(city);
	}
}
