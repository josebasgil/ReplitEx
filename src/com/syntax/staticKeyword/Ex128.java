package com.syntax.staticKeyword;

public class Ex128 {

	static String mixString (String s1, String s2){
	    StringBuilder result = new StringBuilder();
	    for(int i=0;i<s1.length() || i < s2.length();i++){
	       result.append(s1.charAt(i));
	       result.append(s2.charAt(i)); 
	    }
	    return result.toString(); 
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
	}

}
