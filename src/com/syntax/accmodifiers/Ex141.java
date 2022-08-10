package com.syntax.accmodifiers;

public class Ex141 {

	static int maxValue(int arr[]){
	    int max=arr[0];
		for (int maxArr:arr) {
	    	if (maxArr>max) {
	    		max=maxArr;
	    	}
	    } return max;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}

}
