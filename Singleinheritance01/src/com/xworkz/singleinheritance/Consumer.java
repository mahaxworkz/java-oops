package com.xworkz.singleinheritance;

public class Consumer extends Retailer{
	int quantity;
	String mfd;
	String expiringdate;
	
    public Consumer(int quantity,String mfd,String expiringdate) {
    	this.quantity=quantity;
    	this.mfd=mfd;
    	this.expiringdate=expiringdate;
    }
   public void checktheproduct() {
	  System.out.println("consumer checks the products");
    }
   public void buyingproducts() {
	   System.out.println("consumer buy the products");

	
}
}