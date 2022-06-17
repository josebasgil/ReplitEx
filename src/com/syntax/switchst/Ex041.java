package com.syntax.switchst;
import java.util.Scanner;
public class Ex041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input=new Scanner (System.in);
		  int age;
		  String scenario=null;
		  System.out.println("Enter the age of the Child");
		  age=input.nextInt();
		  switch (age){
		    case 1:
		      scenario="You can Crawl";
		      break;
		    case 2:
		      scenario="You can Talk";
		      break;
		    case 3:
		      scenario="You can Dance";
		      break;
		    case 4:
		      scenario="You can get Trouble";
		      break;
		    default:
		      scenario="I don't know how old you are";
		  } 
		  System.out.println(scenario);
		  input.close();
	}

}
