package com.syntax.encapsulation;

public class Ex181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj=new Account();
		obj.setAcc_no("7560504000");
		obj.setName("Sumair");
		obj.setEmail("sumair@syntax.com");
		obj.setAmount(50000.0);
		obj.getAcc_no();
		obj.getName();
		obj.getEmail();
		obj.getAmount();
	}

}

class Account{
	String acc_no;
	String name;
	String email;
	double amount;
	public void getAcc_no() {
		System.out.print(acc_no+" ");
	}
	public void getName() {
		System.out.print(name+" ");
	}
	public void getEmail() {
		System.out.print(email+" ");
	}
	public void getAmount() {
		System.out.print(amount);
	}
	public void setAcc_no(String acc_no){
		this.acc_no=acc_no;
		}
	public void setName(String name){
		this.name=name;
		}
	public void setEmail(String email){
		this.email=email;
		}
	public void setAmount(double amount){
		this.amount=amount;
		}
}
