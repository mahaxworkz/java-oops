package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesDao {
	
      VegetablesDto[] vegcart= new VegetablesDto[10];
      
      
      public boolean AddVeggiesToCart(VegetablesDto dto) {
    	  
    	  for(int i=0;i< vegcart.length;i++) {
    		  if(vegcart[i]==null) {
    			  vegcart[i]=dto;
    			  System.out.println("veggies added to the cart");
    			  return true;
    		  }
    	  }
    	  
    	  
		return false;
    	  
      }
      
      
      public VegetablesDto[] ViewCart() {
		return vegcart;
    	  
      }
      
      public boolean  FindByName(String name) {
    	  
    	  for (int i=0;i<vegcart.length;i++) {
    		  if(vegcart[i].getName().equals(name)) {
    			   System.out.println("vegetable find");
    			  return true;
    		  }
    	  }
    	  return false;
    	  
    	  
      }

      
 public boolean  DeleteByName(String name) {
    	  
    	  for (int i=0;i<vegcart.length;i++) {
    		  if(vegcart[i].getName().equals(name)) {
    			  vegcart[i].setColour(null);
    			   System.out.println(" name deleted");
    			    
    			  return true;
    		  }
    	  }
    	  return false;
    	  
    	  
      }
 
  
 	  
	  
 
      
      
}
