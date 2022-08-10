package com.syntax.accmodifiers;

public class Ex136 {

	private String PrivateMethod(String Priva) {
		return Priva;
	}

	String DefaultMethod(String Defa) {
		return Defa;
	}

	protected String ProtectedMethod(String Prot) {
		return Prot;
	}

	public String PublicMethod(String Publi) {
		return Publi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex136 object=new Ex136 ();
	    System.out.println(object.PrivateMethod("This is Private Method"));
	    System.out.println(object.DefaultMethod("This is Default Method"));
	    System.out.println(object.ProtectedMethod("This is Protected Method"));
	    System.out.println(object.PublicMethod("This is Public Method"));
	}

}
