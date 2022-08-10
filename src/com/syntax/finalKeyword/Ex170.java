package com.syntax.finalKeyword;

public class Ex170 {

	public static void main(String[] args) {
		Abuelo obj1=new Padre();
		Padre obj2=new Nieto();
		obj1.abuelo();
		obj2.padre();
	}
}

class Abuelo{
	final void abuelo() {
		System.out.println("Final method with boolean parameter");
	}
}

class Padre extends Abuelo{
	final void padre() {
		System.out.println("Final method with String parameter");
	}
}

class Nieto extends Padre{
	void nieto() {
		System.out.println();
	}
}