package com.syntax.accmodifiers;

public class Ex140 {

	static String maxLength(String arr[]){
	    String max=arr[0];
		for (String maxArr:arr) {
	    	if (maxArr.length()>max.length()) {
	    		max=maxArr;
	    	}
	    } return max;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"
	}

}
