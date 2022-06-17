package com.syntax.logoper;
import java.util.Scanner; 
public class Ex038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		  String subject;
		  System.out.println("Is it weekend?");
		  boolean question=input.nextBoolean();
		  if (question){
		    subject="Java";
		  } else{
		    subject="manual testing";
		  }
		  System.out.println("Today you will be learning "+subject);
	}

}
