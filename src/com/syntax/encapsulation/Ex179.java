package com.syntax.encapsulation;

public class Ex179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo1 emp=new EncapsulationDemo1();
		emp.setEmpName("Mario");
		emp.setEmpAge(32);
		emp.getEmpName();
		emp.getEmpAge();
	}

}
class EncapsulationDemo1{
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
