package com.syntax.switchst;
import java.util.Scanner;
public class Ex045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		  int number;
		  String day=null;
		  System.out.println("Input a number between 1-7");
		  number=input.nextInt();
		  switch (number){
		    case 1:
		      day="Monday";
		      break;
		    case 2:
		      day="Tuesday";
		      break;
		    case 3:
		      day="Wednesday";
		      break;
		    case 4:
		      day="Thursday";
		      break;
		    case 5:
		      day="Friday";
		      break;
		    case 6:
		      day="Saturday";
		      break;
		    case 7:
		      day="Sunday";
		      break;
		    default:
		      day="Invalid";
		  }
		  System.out.println(day);
		  input.close();
	}

}
