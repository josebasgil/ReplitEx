package com.syntax.staticKeyword;

public class Ex131 {

	 void thirdLetter(String s) {
		  for (int i=0;i<s.length();i=i+3) {
					System.out.print(s.charAt(i));
				}
		}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex131 str=new Ex131();
		str.thirdLetter("hello there"); //"hltr"
		System.out.println(" ");
		str.thirdLetter("technology"); //"thly"
	}

}
