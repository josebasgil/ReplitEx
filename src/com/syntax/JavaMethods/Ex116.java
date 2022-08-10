package com.syntax.JavaMethods;

public class Ex116 {

	void numbers (int num1, int num2){
        if(num1%2==0 && num2%2==0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex116 task116=new Ex116();
	    task116.numbers(5,4);
	}

}
