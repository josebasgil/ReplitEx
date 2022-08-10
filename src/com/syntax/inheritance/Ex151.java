package com.syntax.inheritance;

public class Ex151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array={{1,2,3},{4,5,6},{7,8,9}};
		Method arrays = new Method(); 
		arrays.sum2D(array);
	}
}

class Method extends Ex151{

	void sum2D(int [][]arr) {
		int sumtot=0;
		for (int row=0; row<arr.length;row++) {
				for(int col=0;col<arr[row].length;col++) {
					sumtot=sumtot+arr[row][col];
				} 
			} System.out.println(sumtot);
	}
	
}

