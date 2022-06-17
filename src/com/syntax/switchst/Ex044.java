package com.syntax.switchst;
import java.util.Scanner;
public class Ex044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		  String brand, country;
		  brand=null;
		  country=null;
		  System.out.println("Please enter your favorite car make");
		  brand = input.nextLine();
		  switch (brand){
		    case "BMW":
		      country="german car";
		      break;
		    case "Toyota":
		      country="japanese car";
		      break;
		    case "Maserati":
		      country="italian car";
		      break;
		    default:
		      country="unknown";
		  }
		  System.out.println("Your favorite car is "+country);
		  input.close();
	}

}
