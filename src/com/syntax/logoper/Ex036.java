package com.syntax.logoper;
import java.util.Scanner;
public class Ex036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		  String word1, word2, Output;
		  int int1, int2;
		  Output=null;
		  System.out.println("Please enter two strings");
		  word1=input.next();
		  word2=input.next();
		  System.out.println("Please enter two numbers");
		  int1=input.nextInt();
		  int2=input.nextInt();

		  if (int1==int2 && word1.equals(word2)){
		    Output="AND";
		  } else if (int1==int2 || word1.equals(word2)){
		    Output="OR";
		  } else if (int1!=int2 && !word1.equals(word2)){
		    Output="NONE";
		  }
		   System.out.println(Output);
	}

}
