package com.syntax.stringmanip;

public class Ex091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
		 * Create String str2= SYNTAX TECHNOLOGIES and convert into syntax technologies
		 */
		String str1 = "syntax technologies";
		str1 = str1.toUpperCase();
		System.out.println(str1);
		String str2 = str1;
		str2 = str2.toLowerCase();
		System.out.println(str2);
	}

}
