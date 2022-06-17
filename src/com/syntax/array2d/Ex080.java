package com.syntax.array2d;

public class Ex080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] a = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
		
		//Double and print array
	  for (int row=0; row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.print((a[row][col]*2)+" ");
			} System.out.println(" ");
		}
	}

}
