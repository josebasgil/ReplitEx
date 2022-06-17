package com.syntax.stringmanip;
import java.util.Scanner;
public class Ex099 {

	void printIsPalindrome (String givenString1){
        StringBuilder stringBuilder= new StringBuilder(givenString1);
        stringBuilder.reverse();
        String reversedstr=stringBuilder.toString().toLowerCase();
        if(givenString1.toLowerCase().equals(reversedstr)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex099 object= new Ex099();
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	    String givenString1 = givenString.replace(" ", "");
	    object.printIsPalindrome(givenString1);
	    
		
	}

}
