package com.syntax.scanner;
import java.util.Scanner;
public class Ex020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

	    System.out.println("Please Enter First Name");
	    String name=input.next();

	    System.out.println("Please Enter Last Name");
	    String lastname=input.next();

	    System.out.println(name+" "+lastname);
	}

}
