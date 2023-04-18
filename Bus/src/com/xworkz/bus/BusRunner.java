package com.xworkz.bus;

import com.xworkz.bus.data.Databus;
import com.xworkz.bus.data.Travelingarea;

public class BusRunner extends Databus {

	public BusRunner(String destination, int busno, int driver, int noOfSeats, boolean havedocuments,
			  Travelingarea area) {
		super(destination, busno, driver, noOfSeats, havedocuments,area);
		 
	}

	public static void main(String[] args) {
		 
		 Databus bus =new Databus("Bangalore",8989,2,39,true,Travelingarea.OOTY);
		 //public modifier
		Databus. Startingtravel();
		// public modifier
		 bus.Reachdestination();
		 //protected
		 Databus.CheckSecuritymeasures();
		  
		 
		 

	}

}
