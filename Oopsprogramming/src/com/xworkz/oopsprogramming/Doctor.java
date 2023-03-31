package com.xworkz.oopsprogramming;

public class Doctor {
   String name;
   short age;
   String degree;
   String servicearea;
   int experience;
   
   public Doctor( ) {   
	System.out.println("doctor field");
   }
    
   public void Diagonise_disease() {
	  System.out.println("Doctors diagonise the disease first"); 
   }
   public void Provide_treatement() {
		  System.out.println("Then Doctors provide treatment"); 
	   }
   public void  Counseling() {
		  System.out.println("Doctors counseling patients"); 
	   }
	   
	   
   
}
