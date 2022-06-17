package com.syntax.nesifscan;
import java.util.Scanner;
public class Ex033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner (System.in);
	    
	    System.out.println("Please enter a number");
			int num=input.nextInt();
	    if (num % 2 == 0){
	       System.out.println("Value is even");
	      if (num>=1000){
	        System.out.println("Even value is large");
	      } else{
	        System.out.println("Even value is just right");
	      }
	    } else {
	       System.out.println("Value is odd");
	      if (num>=1000){
	        System.out.println("Odd value is large");
	      } else{
	        System.out.println("Odd value is just right");
	      }
	    }
		
	}

}
