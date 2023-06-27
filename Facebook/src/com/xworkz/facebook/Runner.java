package com.xworkz.facebook;

import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.service.ServiceImp;
import com.xworkz.facebook.service.Superfacebook;

public class Runner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FacebookDto dto= new FacebookDto();
		Superfacebook service = new  ServiceImp();
		dto.setId(4);
		dto.setDOB("04-4-2001");
		dto.setFirstname(" arun");
		dto.setGender("male");
		
		dto.setLastname("kumar");
		dto.setMail("arun@gmail.com");
        dto.setPassword(" fftopuijkg");
        dto.setPhoneNo(98765476938993l);
        
      //service.ValidateSave(dto);
      //  service.readDto(dto);
        
       // service.update("mahalakshmi@gmail.com", 1);
       // service.Deleting("arun@gmail.com");
       // service.readDto01(dto, "varma@gmail.com" );
       // service.update01(dto, "dhanusiya@gmail.com","dhanushya", "saminathan","17-03-2002", 2);
      service.delete01(2);
	}
	

}
