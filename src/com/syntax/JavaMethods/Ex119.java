package com.syntax.JavaMethods;

public class Ex119 {

	void censorLetter(String str, char ch) {
		System.out.println(str.replace(ch, '*'));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex119 task119 = new Ex119();
		task119.censorLetter("computer science", 'e');
		task119.censorLetter("trick or treat", 't');
	}

}
