package com.syntax.staticKeyword;

public class Ex133 {

	static void countA(String s) {
		int count = 0;
		char finder = 'a';
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == finder) {
				count++;
			}

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex133 object=new Ex133();
		object.countA("aaA"); // 3
		object.countA("aaBBdf8k3AAadnklA"); // 6
	}

}
