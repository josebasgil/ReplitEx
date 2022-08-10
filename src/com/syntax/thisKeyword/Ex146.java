package com.syntax.thisKeyword;

public class Ex146 {

	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	Ex146 (){
		
	}
	
	Ex146 (String name, String lastName, int employeeId, String startDate, int salary){
	this.name=name;
	this.lastName=lastName;
	this.employeeId=employeeId;
	this.startDate=startDate;
	this.salary=salary;
	}
	
	void printInfo() {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex146 emp1=new Ex146();
		Ex146 emp2=new Ex146("Joe", "Smith", 12345, "01/01/1970", 35000);
		emp1.printInfo();
		emp2.printInfo();
	}

}
