package com.syntax.staticKeyword;

public class Ex134 {

	static void countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == 'a' || 
					s.toLowerCase().charAt(i) == 'e' || 
					s.toLowerCase().charAt(i) == 'i' ||
					s.toLowerCase().charAt(i) == 'o' ||
					s.toLowerCase().charAt(i) == 'u' ||
					s.toLowerCase().charAt(i) == 'A' ||
					s.toLowerCase().charAt(i) == 'E' ||
					s.toLowerCase().charAt(i) == 'I' ||
					s.toLowerCase().charAt(i) == 'O' ||
					s.toLowerCase().charAt(i) == 'U') {
				count++;
			}
		} System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex134 object=new Ex134();
		object.countVowels("obama"); //3
		object.countVowels("happy friday! i love weekends"); //9
	}

}
