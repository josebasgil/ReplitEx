package com.syntax.switchst;
import java.util.Scanner; 
public class Ex042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input=new Scanner (System.in);
		  int num;
		  String name=null;
		  System.out.println("Enter the roll numer of the Child");
		  num=input.nextInt();
		  switch (num){
		    case 101:
		      name="Student name: Ramesh";
		      break;
		    case 102:
		      name="Student name: Mahesh";
		      break;
		    case 103:
		      name="Student name: Mukesh";
		      break;
		    default:
		      name="Not found Student name: in Class";
		  } 
		  System.out.println(name);
		  input.close();
	}

}
