package com.syntax.array;
import java.util.Scanner;
public class Ex076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		    String[] weekday = new String[7];
		    for (int i = 0; i < 7; i++) {
		      System.out.println("Please enter day " + (i+1) + " of the week");
		      weekday[i]=input.next();
		    }
		    for(String day:weekday) {
					System.out.println(day);
					}
	}

}
