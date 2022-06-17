package com.syntax.logoper;
import java.util.Scanner;
public class Ex039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input=new Scanner (System.in);
		   int mark;
		   String grade=null;
		   System.out.println("Please enter your mark");
		   mark=input.nextInt();
		   if (mark<0){
		     System.out.println("Please enter valid mark");
		   } else{ 
		     if (mark>=1 && mark<=25){
		     grade="F";
		   } else if (mark>25 && mark<=45){
		     grade="E";
		   } else if (mark>45 && mark<=50){
		     grade="D";
		   } else if (mark>50 && mark<=60){
		     grade="C";
		   } else if (mark>60 && mark<=80){
		     grade="B";
		   } else if (mark>80){
		     grade="A";
		   } System.out.println("Your grade is "+grade);
		   }
	}

}
