package com.syntax.array2d;

public class Ex079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Double[][] values= {{1.4, 2.0, 3.3, 2.0},{4.0, 1.5, 6.1, 1.0},{1.2, 3.1, 4.0, 1.6}};
		
		for (int row=0; row<values.length;row++) {
			for(int col=0;col<values[row].length;col++) {
				System.out.print(values[row][col]+" ");
			} System.out.println(" ");
		}  
	}

}
