package com.xworkz.modifiersinoops;

public class Starter {
	
	private static String state="TamilNadu";
	private static int pincode=643217;
	private static String district="The nilgiris";
	private static byte no_of_districts=38;
	
	public static String Callingstate() {
		System.out.println(state);
		return state;
	}

public static int Writepincode() {
		System.out.println(pincode);
		return pincode;
	}

public  String printdistrict() {
	 
	System.out.println(district);
	return district;
}

public byte Count_district() {
	System.out.println(no_of_districts);
	return no_of_districts;
}

}
