package com.syntax.classobj;

public class Ex087 {

	String carColor;
	String carMake;
	int carYear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex087 carw = new Ex087();
		Ex087 carb = new Ex087();
		String first = "Car color is ";
		String second = " and car year is ";
		String third = " and car model is ";

		carb.carColor = "Black";
		carb.carYear = 2019;
		carb.carMake = "BMW";

		carw.carColor = "White";
		carw.carYear = 2018;
		carw.carMake = "Toyota";
		System.out.println(first + carb.carColor + second + carb.carYear + third + carb.carMake);
		System.out.println(first + carw.carColor + second + carw.carYear + third + carw.carMake);

	}

}
