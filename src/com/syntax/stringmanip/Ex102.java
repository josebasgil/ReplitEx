package com.syntax.stringmanip;

import java.util.Scanner;

public class Ex102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below
		for (int i = 0; i < word.length(); i++) {

			System.out.println(word.charAt(i));

		}
	}

}
