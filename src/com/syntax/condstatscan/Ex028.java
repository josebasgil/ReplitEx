package com.syntax.condstatscan;
import java.util.Scanner;
public class Ex028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);

		  System.out.println("Please enter the length");
			int lenght=input.nextInt();

		  System.out.println("Please enter the width");
			int width=input.nextInt();

		  if (lenght==width){
		    System.out.println("The shape of your object is square");
		  } else{
		    System.out.println("The shape of your object is rectangle");
		  }
	}

}
