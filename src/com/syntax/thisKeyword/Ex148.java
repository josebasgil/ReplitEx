package com.syntax.thisKeyword;

public class Ex148 {

	String item;
	double price;
	int quantity;
	
	Ex148 (String item, double price, int quantity){
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}
	
	void itemTotalPrice () {
		Double totalValue=(Double.valueOf(quantity))*price;
		System.out.println(item+" Total Value "+totalValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex148 item1=new Ex148("Blanket", 99.98, 1);
		Ex148 item2=new Ex148("Mattress", 439.18, 1	);
		double Total=item1.price*item1.quantity+item2.price*item2.quantity;
		item1.itemTotalPrice();
		item2.itemTotalPrice();
		System.out.println("You purchased "+Total+" Today");
		
	}

}
