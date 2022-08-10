package com.syntax.JavaMethods;

public class Ex118 {

	void spaceOut(String s){
	     for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				System.out.print(c + " ");
			}
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex118 task118=new Ex118();
	    task118.spaceOut("hello");
	}

}
