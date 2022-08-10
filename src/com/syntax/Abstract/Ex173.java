package com.syntax.Abstract;

public class Ex173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea obj1=new LemonTea(null);
		Tea obj2=new ChaiTea(null);
		obj1.addSugar();
		obj2.addSugar();
	}

}

class Tea{

	String teaType;
	Tea(String teaType){
	this.teaType=teaType;	
	}
	void addSugar() {
		
	}
}

class LemonTea extends Tea{

	LemonTea(String teaType) {
		super(teaType);
		// TODO Auto-generated constructor stub
		System.out.println("For Lemon Tea we need 2 spoons of sugar");
	}
	
}

class ChaiTea extends Tea{

	ChaiTea(String teaType) {
		super(teaType);
		// TODO Auto-generated constructor stub
		System.out.println("For Chai Tea we need 1 spoon of sugar");
	}
	
}
