package com.syntax.condstatscan;
import java.util.Scanner;
public class Ex029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);

		  System.out.println("Please enter first number");
				int x=input.nextInt();

		  System.out.println("Please enter second number");
				int y=input.nextInt();

		  int mult = x*y;

		  if (mult>0){
		  System.out.println("true");
		    } else if (mult<0) {
		    System.out.println("false");
		    }
	}

}
