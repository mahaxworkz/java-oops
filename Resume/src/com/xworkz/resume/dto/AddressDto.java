package com.xworkz.resume.dto;

public class AddressDto{
	
	
	int doorNo;
	String StreetName;
	String area;
	String District ;
	int pincode;
	
	public AddressDto(int doorNo, String streetName, String area, String district, int pincode) {
		super();
		this.doorNo = doorNo;
		StreetName = streetName;
		this.area = area;
		District = district;
		this.pincode = pincode;
	}
	 

}
