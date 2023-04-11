package com.xworkz.polymorphism;

public class Runner {

	public static void main(String[] args) {
		 
		
		Vehicle vehicle = new Vehicle();
		// call  Consume() method from Vehicle
		vehicle.Consume();
		// call Travel() method from Vehicle
		vehicle.Travel();
		// call Ride()  method from Vehicle
		vehicle.Ride();
		System.out.println("---------*---------");
		Car car= new Car();
		// call  Consume() method from Car
				car.Consume();
				// call Travel() method from Car
				car.Travel();
				// call Ride()  method from Car
				car.Ride();
				System.out.println("---------*---------");
				
	     Bike  bike = new Bike();
	     // call  Consume() method from Bike
		 bike.Consume();
			// call Travel() method from Bike
		bike.Travel();
				// call Ride()  method from Bike
		bike.Ride();
		System.out.println("---------*---------");

		 Truck truck =new Truck();
		// call  Consume() method from  Truck
		truck.Consume();
		// call Travel() method from  Truck
		truck.Travel();
		// call Ride()  method from Truck
		truck.Ride();
		System.out.println("---------*---------");
		 
		bus Bus= new bus();
		// call  Consume() method from bus
		Bus.Consume();
		// call Travel() method from bus
		Bus.Travel();
		// call Ride()  method from bus
		Bus.Ride();
		System.out.println("---------*---------");
		Bicycle cycle = new Bicycle();
		 
		// call  Consume() method from Bicycle
		cycle.Consume();
		// call Travel() method from Bicycle
		cycle.Travel();
		// call Ride()  method from Bicycle
		cycle.Ride();
		System.out.println("---------*---------");
		
		
		
	}

}
