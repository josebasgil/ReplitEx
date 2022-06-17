package com.syntax.condstatscan;
import java.util.Scanner;
public class Ex027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

		  System.out.println("Please enter your age");
		  int age=input.nextInt();
		  if (age>=18){
		    System.out.println("You are eligible to vote");
		  } else if (age<18){
		    System.out.println("You are not eligible to vote");
		  }
	}

}
