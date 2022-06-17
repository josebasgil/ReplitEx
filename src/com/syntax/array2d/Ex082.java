package com.syntax.array2d;

public class Ex082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		int sumtot=0;
		for (int row=0; row<a.length;row++) {
				for(int col=0;col<a[row].length;col++) {
					sumtot=sumtot+a[row][col];
				} 
			} System.out.println(sumtot);
		
	}

}
