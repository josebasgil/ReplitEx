package com.syntax.classobj;

public class Ex088 {

	String breed;
	String name;
	String color;

	void bark() {
		System.out.println(" can bark");
	}

	void run() {
		System.out.println(" can run");
	}

	void play() {
		System.out.println(" can play");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex088 Husky = new Ex088();
		Ex088 Bulldog = new Ex088();
		Ex088 Labrador = new Ex088();

		Husky.breed = "Husky";
		Bulldog.breed = "Bulldog";
		Labrador.breed = "Labrador";

		Husky.name = "Laika";
		Bulldog.name = "Pocho";
		Labrador.name = "Teo";

		Husky.color = "gray";
		Bulldog.color = "white";
		Labrador.color = "golden";

		System.out.print(Husky.breed);
		Husky.bark();
		System.out.print(Husky.breed);
		Husky.run();
		System.out.print(Husky.breed);
		Husky.play();
		System.out.print(Bulldog.breed);
		Bulldog.bark();
		System.out.print(Bulldog.breed);
		Bulldog.run();
		System.out.print(Bulldog.breed);
		Bulldog.play();
		System.out.print(Labrador.breed);
		Labrador.bark();
		System.out.print(Labrador.breed);
		Labrador.run();
		System.out.print(Labrador.breed);
		Labrador.play();

	}

}
