package com.syntax.nesifscan;
import java.util.Scanner;
public class Ex031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner (System.in);

		  System.out.println("Is it sunny outside?");
			boolean isSunny=input.nextBoolean();

		  if (isSunny==true){
		    System.out.println("It is a sunny day, I should go somewhere!");
		     System.out.println("What is the temperature outside?");
			int temperature=input.nextInt();
		      if (temperature>=85){
		        System.out.println("I am going to the beach");
		      } else {
		        System.out.println("I am going to the park");
		      }
		  } else if (isSunny==false) {
		    System.out.println("I stay home and practice Java");
		  }
	}

}