package com.syntax.variablesJava;

public class Ex120 {
	int year;
	String schoolName;
	int batch;

	void printInfo() {
		System.out.println("I am a student of batch " + batch + " studying at " + schoolName + " in the year of " + year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex120 student = new Ex120();
		student.year = 2021;
		student.schoolName = "Syntax";
		student.batch = 9;
		student.printInfo();

	}

}
