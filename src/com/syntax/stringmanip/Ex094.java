package com.syntax.stringmanip;

public class Ex094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a String given="I love Java classes at Syntax"
		 * Retrieve 2 Strings using substring method from given String and print them
		 * Expected Output:
		 * 	classes at Syntax
		 * 	I love Java
		 */
		String given = "I love Java classes at Syntax";
	    for (int i = 0; i < given.length(); i++) {
	      if (given.charAt(i) == 'c') {
	        System.out.println(given.substring(i, given.length()));

	        System.out.println(given.substring(0, i - 1));
	        break;
	      }
	    }
		
	}

}
