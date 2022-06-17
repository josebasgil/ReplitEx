package com.syntax.array2d;

public class Ex083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		  int row1=0;
	    int row2=0;
	    int row3=0;
	    int row4=0;
	    for (int row=0; row<a.length;row++) {
				for(int col=0;col<a[row].length;col++) {
					row1=row1+a[0][col];
	        row2=row2+a[1][col];
	        row3=row3+a[2][col];
	        row4=row4+a[3][col];
	        
				} break;
			} 
	    System.out.println(row1);
	    System.out.println(row2);
	    System.out.println(row3);
	    System.out.println(row4);
	}

}
