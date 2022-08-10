package com.syntax.encapsulation;

public class Ex178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationDemo emp=new EncapsulationDemo();
		emp.setEmpName("John");
		emp.setEmpAge(30);
		emp.getEmpName();
		emp.getEmpAge();
	}

}

class EncapsulationDemo{
	private String empName;
	private int empAge;
	public void getEmpName() {
		System.out.println("Employee Name: "+empName);
	}
	public void getEmpAge() {
		System.out.println("Employee Age: "+empAge);
	}
	public void setEmpName(String empName){
		this.empName=empName;
		}
	public void setEmpAge(int empAge){
		this.empAge=empAge;
		}
}
