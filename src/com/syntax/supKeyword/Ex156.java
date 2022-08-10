package com.syntax.supKeyword;

public class Ex156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BS object=new BS();
		object.printInfo();
	}

}

class AS{
	int ij=10;
}
class BS extends AS{
	int ij=20;
	void printInfo() {
	System.out.println(ij);
	System.out.println(super.ij);
	
	}
}

