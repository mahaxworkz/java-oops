package com.xworkz.resume.dao;

import com.xworkz.resume.dto.ResumeDto;

public class ResumeDao {

	ResumeDto[] resume = new ResumeDto[10];

	public ResumeDto[] SaveDetails(ResumeDto dto) {
		if (dto != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] == null) {
					resume[i] = dto;
					System.out.println("the values are added ");
					return resume;
				}
				System.out.println("the index have some value");
			}
			System.out.println("Already resume contains all data");
			return resume;
		}
		System.out.println("the resume data is null  ");
		return resume;

	}
	
	 
	public ResumeDto[] Read() {
		return resume;
	}

	public ResumeDto SearcByName(String Name) {

		if (Name != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					resume[i].getName().equals(Name);
					System.out.println("name found");
					return resume[i];
				}
				System.out.println("the name not match,so the index will be i++");
			}
			System.out.println("the name is not found");
			return null;
		}
		System.out.println("the given name is null");
		return null;
		/////

	}

	public ResumeDto SearchByMail(String mail) {

		if (mail != null ) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if (resume[i].getEmail().equals(mail)) {
						System.out.println("mail id found");
						return resume[i];
					}
					System.out.println("the  email id not match,so the index will be i++");
				}
				
			}
			System.out.println("the  email id is not found");
			return null;
		}
		System.out.println("the given email id is null or not valid ");
		return null;

	}

	public boolean UpdateDegreeByName(String name, String degree) {

		if (name != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if(resume[i].getName().equalsIgnoreCase(name)) {
						resume[i].setDegree(degree);
						System.out.println("degree updated");
						
						return true;
					}
					System.out.println(" name not found ,so index is i++");
					 
				}
                 
			}
			System.out.println(" name not found");
			return false;
		}
		System.out.println(" name not valid");
        return false;   
	}
	
	//////
	public boolean UpdatePhoneNoBymail(String  mail, long phoneNo) {

		if (mail!= null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if(resume[i].getEmail().equalsIgnoreCase(mail)) {
						resume[i].setMobileNo(phoneNo);
						System.out.println("Contact number  updated");
						
						return true;
					}
					System.out.println("  Email not found ,so index is i++");
					 
				}
                 
			}
			System.out.println("  email not found");
			return false;
		}
		System.out.println(" mail id not valid");
        return false;   
	}
	
	
	public boolean DeleteN0byFathername (String Fathername) {
		if(Fathername != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if(resume[i].getFathername().equalsIgnoreCase(Fathername)) {
						resume[i].setMobileNo(0);
						System.out.println(" Number deleted");
						
						return true;
					}
					System.out.println("   Father name not found ,so index is i++");
					 
				}
                 
			}
			System.out.println("Father name not found");
			return false;
			
		}
		System.out.println("name is not valid");
		return false;
	}
	
}
