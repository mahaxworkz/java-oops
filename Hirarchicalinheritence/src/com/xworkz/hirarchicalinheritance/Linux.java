package com.xworkz.hirarchicalinheritance;

public class Linux extends Operatingsystem {
    String name;
	boolean issourcefree;
	
	public Linux(String name,boolean issourcefree) {
		this.issourcefree=issourcefree;
		this.name=name;
	}
	
	public void Functionality() {
		System.out.println(" Linux allow the user to acess the source free");
	}
}
