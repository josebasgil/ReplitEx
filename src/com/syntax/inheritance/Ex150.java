package com.syntax.inheritance;

public class Ex150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1=new Employee();
		Student obj2=new Student();
		Retiree obj3=new Retiree();
		obj1.name="Joe"; obj1.lastName="Smith";	obj1.age=35; obj1.salary=35000;
		obj2.name="Adam"; obj2.lastName="Smith"; obj2.age=15; obj2.grade=10;
		obj3.name="Frank"; obj3.lastName="Smith"; obj3.age=15; obj3.seniorActivity="tour";
		obj1.Employees();
		obj2.Students();
		obj3.Retirees();
	}

}

class Person{
	String name;
	String lastName;
	int age;
	void persons() {
		System.out.println(name+" "+lastName+" "+age);
	}
}

class Employee extends Person{
	int salary;
	void Employees() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
}

class Student extends Employee{
	int grade;
	void Students() {
		System.out.println(name+" "+lastName+" "+age+" "+grade);
	}
}

class Retiree extends Student{
	String seniorActivity;
	void Retirees() {
		System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}
}

