package com.syntax.stringmanip;
import java.util.Scanner; 
public class Ex097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    String conclusion;
		   switch (browser.toLowerCase()) {
		   case "chrome":
			   conclusion="Proceed with Chrome browser";
			   break;
		   case "firefox":
			   conclusion="Proceed with Firefox browser";
			   break;
		   case "ie":
			   conclusion="Proceed with IE browser";
			   break;
		   default:
			   conclusion="Invalid browser";
			 
		}
		   System.out.println(conclusion);
	}

}
