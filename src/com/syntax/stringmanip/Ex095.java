package com.syntax.stringmanip;
import java.util.Scanner;
public class Ex095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		String str=scan.next();
		String str1=str.substring(0,3);
		
		System.out.println("The first 3 letters of "+str+" is "+str1);
		
	}

}
