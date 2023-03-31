package com.xworkz.singleinheritance;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Consumer consume=new Consumer(10,"24jan23","04may24");
         System.out.println(consume.quantity);
         System.out.println(consume.mfd);
         System.out.println(consume.expiringdate);
         consume.SellingProducts();
         consume.checktheproduct();
         consume.buyingproducts();
	}

}
