package com.syntax.accmodifiers;

class AnotherClass{
	  
	String DefaultMethod(String Defa) {
		return Defa;
	}

	protected String ProtectedMethod(String Prot) {
		return Prot;
	}

	public String PublicMethod(String Publi) {
		return Publi;
	}
  
}

public class Ex138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnotherClass object=new AnotherClass ();
	    System.out.println(object.DefaultMethod("default"));   
	    System.out.println(object.ProtectedMethod("protected"));  
	    System.out.println(object.PublicMethod("public")); 
	    
	}

}
