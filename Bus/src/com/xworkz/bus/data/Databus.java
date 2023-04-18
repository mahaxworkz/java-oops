package com.xworkz.bus.data;

public class Databus {
	public static String busname;
	public static String Startingfrom;
	String destination;
	int busno;
	int driver;
	int noOfSeats;
	private static int ticketprice ;
	private int speed=40;
	protected boolean havedocuments;
	protected static  boolean luggagefacility;
	Travelingarea area;
	
	//static block
	static {
		busname="RSR";
		Startingfrom="OOTY";
		ticketprice=240;
		luggagefacility= true;
				
	}
	// create constructor
	 public Databus(String destination,int busno,int driver,int noOfSeats,boolean havedocuments ,Travelingarea area ) {
		 this.destination=destination;
		this.busno=	busno;
		this.driver= driver;
		this.noOfSeats= noOfSeats;
		this.havedocuments=havedocuments;
		this.area=area;
	 }
	public static String Startingtravel() {
		 System.out.println(ticketprice );
		 System.out.println(Startingfrom ); 
		return Startingfrom;
	}
	public  String Reachdestination() {
		 System.out.println("reach the destination");
		 Checkingdoc();
		 return busname;
	}
	 private String Checkingdoc() {
		 System.out.println(havedocuments);
		 System.out.println(busno);
		 System.out.println( driver);
		 System.out.println(  speed);
		 
		 return  destination;
	}
	 protected  static void CheckSecuritymeasures() {
		 System.out.println(luggagefacility );
	
	 }
	 int Checkcomfortablity() {
		 System.out.println(noOfSeats);
		return noOfSeats; 
	 }
	 

}
