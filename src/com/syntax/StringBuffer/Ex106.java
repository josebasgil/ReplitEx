package com.syntax.StringBuffer;

public class Ex106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer();
		str.append("Hello ");
		str.append("World");

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			str.setCharAt(i, Character.toUpperCase(c));
		}
		System.out.println(str);
	}

}
