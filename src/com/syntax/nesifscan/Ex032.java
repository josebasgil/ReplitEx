package com.syntax.nesifscan;
import java.util.Scanner;
public class Ex032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner (System.in);

        System.out.println("Please enter your gender: M or F");
        char gender=input.next().charAt(0);

        System.out.println("Please enter your age");
		    int age=input.nextInt();

        if (age>=25){
          if (gender=='F'){
             System.out.println("Woman");
          } else if (gender=='M'){
             System.out.println("Man");
          }
        } else {
          if (gender=='F'){
             System.out.println("Girl");
          } else if (gender=='M'){
             System.out.println("Boy");
          }
        }
	}

}
