package com.syntax.staticKeyword;

public class Ex132 {

	public static void reduce10(int [][] a){
		   for (int row=0;row<a.length;row++){
		     for (int col=0;col<a[row].length;col++){
		       System.out.print((a[row][col]-10)+" ");
		     }
		     System.out.println("");
		   }
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{1,2,3,4},
				{4,5,6,7},
				{1,3,5,7}
			};
			reduce10(a);
	}

}
