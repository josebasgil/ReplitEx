package com.syntax.logoper;
import java.util.Scanner; 
public class Ex035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		   boolean need;
		   int score;
		   String eligibility=null;

		   System.out.println("Do you need a loan?");
		   need=input.nextBoolean();

		   if (need){
		     System.out.println("What is your credit score?");
		     score=input.nextInt();
		     if (score<600){
		       eligibility="Not eligible";
		     } else if (score>=600 && score<=700){
		       eligibility="Maybe eligible";
		     } else if (score>=701 && score<=800){
		       eligibility="Eligible";
		     } else if (score>800){
		       eligibility="Definitely eligible";
		     }
		   } else{
		       eligibility="Unknown";
		    }
		           
		   System.out.println("The eligibility is "+eligibility);
	}

}
