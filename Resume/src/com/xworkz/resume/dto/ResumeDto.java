package com.xworkz.resume.dto;

public class ResumeDto {
	
	private String Name;
	private String DOB;
	private String Fathername;
	private long mobileNo;
	private String Email;
	private String degree;
	private AddressDto address;
	
	
	public ResumeDto(String name, String DOB, String fathername, long mobileNo, String email,String degree, AddressDto address) {
	    this.Name = name;
		this.DOB = DOB;
		this.Fathername = fathername;
		this.mobileNo = mobileNo;
		this.Email = email;
		this.degree=degree;
        this.address = address;
		
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = DOB;
	}


	public String getFathername() {
		return Fathername;
	}


	public void setFathername(String fathername) {
		Fathername = fathername;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public AddressDto getAddress() {
		return address;
	}


	public void setAddress(AddressDto address) {
		this.address = address;
	}


	 
	public String toString() {
		return "ResumeDto [Name=" + Name + ", DOB=" + DOB + ", Fathername=" + Fathername + ", mobileNo=" + mobileNo
				+ ", Email=" + Email + ", degree="+degree+ ", address=" + address + "]";
	}
	
	
	
	
	

}
