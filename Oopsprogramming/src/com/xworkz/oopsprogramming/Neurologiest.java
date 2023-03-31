package com.xworkz.oopsprogramming;

public class Neurologiest extends Doctor {

	String SpecializedField;
	String graduationfrom;
	
	 public Neurologiest(String SpecializedField,String graduationfrom) {
	    	this.SpecializedField = SpecializedField;
	    	this.graduationfrom = graduationfrom;
	    }
	
	public void diagonize_brain() {
		  System.out.println("Neurologist diagonize nerve system & brain"); 
	   }
	public void treatement_brain() {
		  System.out.println("Neurologist give treatement of diseases of nerve system & brain"); 
	   }
	   
}
