package com.xworkz.oopsprogramming;

public class Urologist extends Doctor {
     int Salary;
     boolean dosurgery; 
     public Urologist(int Salary,boolean dosurgery) {
    	 this.dosurgery=dosurgery;
    	 this.Salary=Salary;
     }
	public void doing_procedures() {
		  System.out.println("Cystoscopy,Robotic surgery,blue light Cystoscopy"); 
	   }
  public void treatment() {
			  System.out.println("Urologist treats both women and men"); 
		   }
}
