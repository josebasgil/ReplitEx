package com.syntax.contructor;

public class Ex142 {

	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	
	Ex142(){
	    System.out.print("");
	  }
	Ex142(String schoolName, int batch, int year, String lastDayOfClass){
		this.schoolName=schoolName;
		this.batch=batch;
		this.year=year;
		this.lastDayOfClass=lastDayOfClass;	
	}
	
	void printInfo() {
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex142 obj1=new Ex142();
		obj1.printInfo();
		Ex142 obj2=new Ex142("Syntax",6,2020,"07/30/2020");
		obj2.printInfo();
	}

}
