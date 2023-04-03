package com.xworkz.hirarchicalinheritance;

public class Windows extends Operatingsystem {
    boolean isfast;
	int no_of_versions;
	
	public Windows (boolean isfast,int no_of_versions) {
		this.isfast=isfast;
		this.no_of_versions=no_of_versions;
	}	
	public void Functionality() {
		System.out.println("windows allow the user to easily run daily task");
	}
	

}
