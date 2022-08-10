package com.syntax.encapsulation;

public class Ex182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person obj=new Person("John", "Doe","10","25","1900","123-45-6789");
		obj.getFirstname();
		obj.getLastname();
		obj.getBirthDate();
		obj.getSsn();
	}

}

class Person{
	String firstname, lastname, birthmonth, birthday, birthyear, ssn;
	
	public void getFirstname() {
		System.out.println(firstname);
	}
	public void getLastname() {
		System.out.println(lastname);
	}
	public void getBirthDate() {
		System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
	}
	public void getSsn() {
		System.out.println(ssn);
	}
	
	Person(String firstname, String lastname, String birthmonth, String birthday, String birthyear, String ssn){
	this.firstname=firstname;
	this.lastname=lastname;
	this.birthmonth=birthmonth;
	this.birthday=birthday;
	this.birthyear=birthyear;
	this.ssn=ssn;
	}
}

