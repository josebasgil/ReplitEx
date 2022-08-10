package com.syntax.variablesJava;

public class Ex126 {

	static int count=0;
	private static void instances(){
        count++;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex126 object1 = new Ex126();
		Ex126 object2 = new Ex126();
		Ex126 object3 = new Ex126();
	    object1.instances();
	    object2.instances();
	    object3.instances();
	    
	    System.out.println(count);
	}

}
