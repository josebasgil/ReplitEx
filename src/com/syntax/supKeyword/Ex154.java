package com.syntax.supKeyword;

public class Ex154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 child1=new Child4();
		Child4 child2=new Child4(10);
	}

}
class Parent4{
	Parent4(){
		System.out.println("Parent Constructor without argument");
	}
	Parent4(int number){
		System.out.println(number);
	}
}
class Child4 extends Parent4{
	Child4(){
		super();
		System.out.println("Child Constructor without argument");
	}
	Child4(int number){
		super(number);
	}
}
