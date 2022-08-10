package com.syntax.finalKeyword;

public class Ex168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Father obj=new Son();
		obj.Word();
	}

}

class Father{
	final void Word(){
		String word="hello";
		for (int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}System.out.println(" ");
	}
}
class Son extends Father{
	final void NewWord() {
		System.out.println();
	}
}