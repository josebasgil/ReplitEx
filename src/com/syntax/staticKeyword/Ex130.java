package com.syntax.staticKeyword;

public class Ex130 {

	static void mystery(int[] array)	{
		 for (int i=0;i<array.length;i++){
      if (array[i]%2==0){
        array[i]=array[i]/2;
      }else if(array[i]%2==1){
        array[i]=array[i]*10;
      }System.out.print(array[i]+" ");
    }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5};
		mystery(a);
		// should print out 10 1 30 2 50
	}

}