package com.syntax.finalKeyword;

public class Ex169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upperClass obj=new downClass();
		int[] a = {2,7,3,8,4};
		//System.out.println(avgElements(a)); //should print 4.8
		obj.avgElements(a);
	}

}
class upperClass{
	  final void avgElements(int [] arr){
	    double sum=0;
	    for (int i=0;i<arr.length;i++){
	      sum+=arr[i];
	    }
	    double sumd=sum;
	    System.out.println(sumd/arr.length);
	  }
	}
	class downClass extends upperClass{
	  void childs(){
	    System.out.println();
	  }
	}
