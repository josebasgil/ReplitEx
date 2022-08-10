package com.syntax.thisKeyword;

public class Ex145 {

	String dogName;
	double dogWeight;
	static String dogBreed="Mutt";
	
	Ex145 (String dogName, double dogWeight){
		this.dogName=dogName;
		this.dogWeight=dogWeight;
		
	}
	
	void printInfo() {
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex145 dog1=new Ex145("Tarzan",50);
		Ex145 dog2=new Ex145("Lucy",10);
		dog1.printInfo();
		dog2.printInfo();
	}

}
