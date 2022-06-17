package com.syntax.array2d;

public class Ex081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int numbers[]= {5, 4, 8};
		    int may=0;
				for (int i=0;i<numbers.length;i++) {
					for(int j = i + 1; j < numbers.length; j++) {  
			                if(numbers[i] > numbers[j]) {  
			                   may=numbers[i];  
			            }  else{
		                     may=numbers[j]; 
		              }
			        }  
				}
		    System.out.println(may);  
		       
	}

}
