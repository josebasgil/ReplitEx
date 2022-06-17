package com.syntax.nestedloop;

public class Ex069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int y = 1; y <= 7; y++) {
		      for (int x = 1; x <= (8 - y); x++) {
		        System.out.print(x + " ");
		      }
		      System.out.println(" ");
		      
		    }
		    for (int a = 1; a <= 6; a++) {
		      for (int b = 1; b <= (1+a); b++) {
		        System.out.print(b + " ");
		      }
		      System.out.println(" ");
		      
		    }
	}

}
