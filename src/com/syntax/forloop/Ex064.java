package com.syntax.forloop;
import java.util.Scanner;
public class Ex064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input=new Scanner (System.in);
		  int x;
		  x=input.nextInt();
		  for (int y=0;y<(2*x);y++){
		  System.out.print(y+" ");
		  }
		  input.close();
		
	}

}
