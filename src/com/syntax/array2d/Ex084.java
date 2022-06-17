package com.syntax.array2d;

public class Ex084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int count=0;
	    for (int row=0; row<a.length;row++) {
				for(int col=0;col<a[row].length;col++) {
					if ((a[row][col]<0)&& (a[row][col]%2==1 || a[row][col]%2==-1) ) {
						count=count+1;
					} 
					
				} 
			} System.out.println(count);
	}

}
