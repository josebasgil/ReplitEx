package com.syntax.accmodifiers;

public class Ex137 {

	String name;
	String city;
	String school;
	int batch;

	public void Format() {
		System.out.println(
				"My name is " + name + " and I live in " + city + ". I study at " + school + " in batch " + batch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex137 object=new Ex137 ();
	    object.name="John";
	    object.city="Miami";
	    object.school="Syntax";
	    object.batch=9;
	    object.Format();
	}

}
