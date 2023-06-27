package com.xworkz.facebook.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class FacebookDto {
	 
	private Integer id;
	@NotBlank
	@NotEmpty
	 @Size (min=3 ,max=50)
	private String firstname;
	@NotBlank
	@NotEmpty
	private String lastname;
	private String DOB;
	@NotBlank
	@NotEmpty
	@Email
	private String mail;
	 
	 
	   
	private Long phoneNo;
	private String Gender;
	 @Size (min=8 ,max=16)
	private String Password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	  public FacebookDto() {
		System.out.println("default"); 
	}
	  public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
	@Override
	public String toString() {
		return "FacebookDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB
				+ ", mail=" + mail + ", phoneNo=" + phoneNo + ", Gender=" + Gender + ", Password=" + Password + "]";
	}
	public FacebookDto(@NotBlank @NotEmpty Integer id, @NotBlank @NotEmpty @Size(min = 3, max = 50) String firstname,
			@NotBlank @NotEmpty String lastname, String dOB, @NotBlank @NotEmpty @Email String mail,
			@Size(min = 10) Long phoneNo, String gender, @Size(min = 8, max = 16) String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		DOB = dOB;
		this.mail = mail;
		this.phoneNo = phoneNo;
		Gender = gender;
		Password = password;
	}
	 
	
	
	

}
