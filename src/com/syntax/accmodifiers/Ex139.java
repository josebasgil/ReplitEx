package com.syntax.accmodifiers;

public class Ex139 {

	public static String alphabetical(String str){

		str=str.toLowerCase();
		char max=str.charAt(0);
		String result=String.valueOf(str.charAt(0));
		for (int i=1;i<str.length();i++) { // apparently you can compare higher or lower word in the alphabet
			if (max<str.charAt(i)) { // if he second char is higher than the previous
				result=result+String.valueOf(str.charAt(i));// Compile each char into a string word
				max=str.charAt(i); // switch to the next char to right
			}
		}
		return (String)result;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(alphabetical("hello"));
		System.out.println(alphabetical("software"));
		System.out.println(alphabetical("language"));
	}

}
