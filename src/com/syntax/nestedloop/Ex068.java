package com.syntax.nestedloop;

public class Ex068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String $="$";
		  for (int y=1;y<=4;y++){
		    for (int x=1;x<=4;x++){
		      if (x==2 && y==2 || x==3 && y==3 || x==2 && y==3 || x==3 && y==2){
		        System.out.print(" ");
		        continue;
		      } System.out.print($);
		    } System.out.println(" ");
		  }
	}

}
