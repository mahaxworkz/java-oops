package com.xworkz.hirarchical02;

public class Blackpanther extends Wildanimal{
	
	 public void Hunting() {
		   System.out.println("Blackpanther hunt its prey");
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger cub=new Tiger();
		cub.Callingas();
		cub.feeding();
		Lion lio=new Lion();
		lio.Calledas();
		Blackpanther bp= new Blackpanther();
		bp.Hunting();

	}

}
