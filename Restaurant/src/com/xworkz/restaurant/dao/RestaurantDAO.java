package com.xworkz.restaurant.dao;

public class RestaurantDAO {

   String[] foodlist=new String[20];
	 
	 public String[] Savestring (String str) {
		 
		   if(str!=null && str.length()>3)
		   {
			
		           for(int i=0;i<foodlist.length;i++) 
		              {
			                 if(foodlist[i]==null )
			                 { 
		 
		                       foodlist[i] =str;
		                       System.out.println(foodlist[i]);
		                        return foodlist;
	                         }
		               } 
	       }
		   System.out.println("not executing");
		return foodlist;
		
		
}
	 
	 public void readhotel() {
		 for(int j=0;j>foodlist.length;j++) {
	    	 System.out.println(foodlist[j]);
	     }
	 } }

	 
	
