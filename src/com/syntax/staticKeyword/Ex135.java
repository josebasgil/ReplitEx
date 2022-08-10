package com.syntax.staticKeyword;

public class Ex135 {

	static void surround(String s, String search_term) {
		char index=search_term.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==index) {
				System.out.print("("+s.charAt(i)+")");
				
			} else {
				System.out.print(s.charAt(i));
			}
		} System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex135 object=new Ex135();
		object.surround("abcabcabc","c"); //"ab(c)ab(c)ab(c)"
		object.surround("technology","o"); //"techn(o)l(o)gy"
	}

}
