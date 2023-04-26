package com.xworkz.grossery;

import com.xworkz.grossery.dao.Grosserydao;

public class Runner {

	 
	public static void main(String[] args) {
		
		
		 Grosserydao list=new Grosserydao();
		 System.out.println("------------CREATE-------------");
		 list.Createlist("peanuts");
		 list.Createlist("peanut butter");
		 list.Createlist("chips");
		 list.Createlist("bread");
		 list.Createlist("biscuits");
		 list.Createlist("almonds");
		 list.Createlist("ghee");
		 
		 
		 
		 System.out.println("------------READ-------------");
		 list.readlist();
    
		 System.out.println("------------UPDATE-------------");
		   // update by index
		// list.Updatelist("milk", 2);
		 //update by string
		 list.UpdateName("water", "jam");
		 list.readlist();
		 
		 System.out.println("------------DELETE-------------");
		 // delete by index
		 list.Deletebyindex(2);
		 // delete by string
		 list.Deletebyname("bread");
		 list.readlist();
	}

}
