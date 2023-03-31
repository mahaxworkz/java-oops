package com.xworkz.oopsprogramming;

public class Cardiologiest extends Doctor {
    int courseduration;
    int workinghours;
    
    public Cardiologiest(int courseduration,int workinghours) {
    	this.courseduration=courseduration;
    	this.workinghours=workinghours;
    }
    public void diagonize_heart() {
		  System.out.println("Cardiologiest diagonize heart &blood vessels diseases"); 
	   }
    public void do_surgery() {
			  System.out.println("MS in general surgery needed for heart surgery"); 
		   }
    
}

