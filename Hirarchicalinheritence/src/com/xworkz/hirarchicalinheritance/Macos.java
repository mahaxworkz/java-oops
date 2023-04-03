package com.xworkz.hirarchicalinheritance;

public class Macos extends Operatingsystem{

	public void installing() {
		System.out.println("mac os is not free to install");
	}
	
   public void main (String[] args) {
	    Windows unix=new Windows(true,17);
	   unix.Functionality();
	   unix.managing();
	   Linux lin=new Linux("ubuntu",true);
	   lin.Functionality();
   }
}
