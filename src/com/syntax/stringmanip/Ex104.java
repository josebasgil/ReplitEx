package com.syntax.stringmanip;
import java.util.Scanner;
public class Ex104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		 for (int i = 0; i < 5; i++) {
			 names[i]=input.next();
			
		 }
		 for(String name:names) {
				System.out.println(name.substring(0,3));
				}
	}

}
