package com.syntax.forloop;
import java.util.Scanner;
public class Ex065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	    int x;
	    x=input.nextInt();
	    for(int y=(x-1);y>=0;y--){
	      System.out.print(y+" ");
	    }
	    input.close();
		
	}

}
