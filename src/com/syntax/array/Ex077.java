package com.syntax.array;
import java.util.Scanner;
public class Ex077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	    int[] numbers=new int[5];
	    for (int i=0;i<numbers.length;i++) {
				numbers[i]=input.nextInt();
	    } 
	    for (int j=numbers.length-1;j>=0;j--) {
				System.out.println(numbers[j]);   
	    } 
		
	}

}
