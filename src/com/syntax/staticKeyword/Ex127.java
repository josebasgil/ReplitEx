package com.syntax.staticKeyword;

public class Ex127 {

	void nonStatic(){
		  System.out.println("Programming is amazing.");
		}
		static void YesStatic(){
		  System.out.println("Java is awesome.");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex127 object=new Ex127 ();
		  object.nonStatic();
		  object.YesStatic();
	}

}
