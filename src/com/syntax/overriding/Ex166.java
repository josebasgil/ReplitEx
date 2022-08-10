package com.syntax.overriding;

public class Ex166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal [] arr= {new Cat("Cat"," eats"," sleeps a lot"),new Kitten1("Kitten1"," eats milk"," sleeps a lot"),new Kitten2("Kitten2", " eats snacks"," sleeps a lot"),new Kitten3("Kitten3"," eats everything"," sleeps a lot")};
		for (Animal animal:arr) {
			animal.eat();
			animal.sleep();
		}		
	}

}

class Animal{
	String animal;
	String eat;
	String sleep;
	Animal (String animal, String eat, String sleep){
		this.animal=animal;
		this.eat=eat;
		this.sleep=sleep;
		
	}
	void eat() {
		System.out.println(animal+eat);
	}
	void sleep() {
		System.out.println(animal+sleep);
	}
}

class Cat extends Animal{
	Cat(String animal, String eat, String sleep) {
		super(animal, eat, sleep);
		// TODO Auto-generated constructor stub
	}
	void eat() {
		System.out.println(animal+eat);
	}
	public void sleep() {
		System.out.println(animal+sleep);
	}
}

class Kitten1 extends Cat{
	Kitten1(String animal, String eat, String sleep) {
		super(animal, eat, sleep);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println(animal+eat);
	}
}

class Kitten2 extends Cat{
	Kitten2(String animal, String eat, String sleep) {
		super(animal, eat, sleep);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println(animal+eat);
	}
}

class Kitten3 extends Cat{
	Kitten3(String animal, String eat, String sleep) {
		super(animal, eat, sleep);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println(animal+eat);
	}
}