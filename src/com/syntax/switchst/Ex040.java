package com.syntax.switchst;
import java.util.Scanner; 
public class Ex040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		  String instruc, respon;
		  System.out.println("Enter name of the instructor");
		  instruc=input.nextLine();
		  switch (instruc){
		    case "Asghar":
		      respon="Will take care of Java Assignment";
		      break;
		    case "Moazzam":
		      respon="Will take care of SDLC Assignment";
		      break;
		    case "Weqas":
		      respon="Will take care of Selenium Assignment";
		      break;
		    case "Asel":
		      respon="Will take care of every Assignment";
		      break;
		    default:
		      respon="Invalid instructor selected";
		  }
		  System.out.println(respon);
		  input.close();
	}

}
