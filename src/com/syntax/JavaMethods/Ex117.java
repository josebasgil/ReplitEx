package com.syntax.JavaMethods;

public class Ex117 {
	
	void sumEvenToX (int x){
	    int count=0;
	    for (int i=1;i<=x;i++){
	      if(i%2==0){
	        count+=i;    
	        } 
	    } 
	    System.out.println(count);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex117 task117=new Ex117();
	    task117.sumEvenToX(5);
	    
	}

}
