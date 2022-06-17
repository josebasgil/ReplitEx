package com.syntax.forloop;
import java.util.Scanner;
public class Ex063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int x;
		   Scanner input=new Scanner(System.in);
		   x=input.nextInt();
		   for(int y=0;y<x;y++){
		     System.out.print(y+" ");
		   }
		   input.close();
	}

}
