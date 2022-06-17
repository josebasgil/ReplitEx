package com.syntax.logoper;

import java.util.Scanner;

public class Ex037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		boolean thirsty, sleepy;
		String drink;
		System.out.println("Are you thirsty?");
		thirsty = input.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = input.nextBoolean();
		if (thirsty == true && sleepy == false) {
			drink = "water";
		} else if (thirsty == true && sleepy == true) {
			drink = "coffee";
		} else if (thirsty == false && sleepy == true) {
			drink = "tea";
		} else {
			drink = "nothing";
		}
		System.out.println("Looks like you need to drink " + drink);
	}

}
