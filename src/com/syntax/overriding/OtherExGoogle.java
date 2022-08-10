package com.syntax.overriding;

import java.io.*;

public class OtherExGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Dog1 d1 = new Dog1();
	        Animal1 a1 = new Animal1();
	 
	        d1.eat();
	        a1.eat();
	 
	        Animal1 animal = new Dog1();
	        // eat() method of animal class is overridden by
	        // base class eat()
	        animal.eat();	
	}

}

class Animal1 {
	 
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}

class Dog1 extends Animal1 {
	 
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}