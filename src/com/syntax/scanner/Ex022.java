package com.syntax.scanner;

import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = input.next();

		System.out.println("Enter your mobile number");
		String mobile = input.next();

		System.out.println("Enter your age");
		int age = input.nextInt();

		System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + mobile);
	}

}
