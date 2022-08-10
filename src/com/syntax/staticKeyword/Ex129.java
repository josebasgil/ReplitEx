package com.syntax.staticKeyword;

public class Ex129 {

	static String countryName;
	static String continent;
	static void printInfo(){
	  System.out.println(countryName+" located on "+continent+" continent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex129 object=new Ex129();
		  object.countryName="Morocco";
		  object.continent="Africa";
		  object.printInfo();
	}

}
