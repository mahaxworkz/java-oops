package com.xworkz.aggregation;

public class Patients {
    int attenderno;
    String name;
    long mobileno;
    String disease;
    boolean wanttoadmit;
    public Patients( int attenderno,String name,long mobileno, String disease, boolean wanttoadmit) {
    	this.attenderno=attenderno;
    	this.name=name;
    	this.disease=disease;
    	this.mobileno=mobileno;
    	this.wanttoadmit=wanttoadmit;
    }
    
}
