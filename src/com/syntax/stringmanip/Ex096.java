package com.syntax.stringmanip;
import java.util.Scanner; 
public class Ex096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   String conclusion;
		   switch (language) {
		   case "Java":
			   conclusion=language+" is a programming language";
			   break;
		   case "C":
			   conclusion=language+" is a procedural programming language";
			   break;
		   case "C++":
			   conclusion=language+" is a middle-level programming language";
			   break;
		   default:
			   conclusion="Doesn't match any programming language";
			 
		}
		   System.out.println(conclusion);
	}

}
