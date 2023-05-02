package com.xworkz.resume;


import com.xworkz.resume.dao.ResumeDao;
import com.xworkz.resume.dto.AddressDto;
import com.xworkz.resume.dto.ResumeDto;

public class ResumeRunner {

	public static void main(String[] args) {
		 AddressDto venue= new AddressDto(10, "sivaji street", "BTM", "Bangalore", 530068);
		 
		ResumeDto dto =new ResumeDto("Venkatesh", "04-11-2001", "Srinivasan",12345678910l,"venki123@gmail.com","B.E", venue);
		AddressDto venue01= new AddressDto(13, "  rajaji street", "palladam", "Coimbatore",  643219);
		ResumeDto dto01=new ResumeDto("Ram", "22-11-2001", "Harikrishnan", 1357826348l,"Hariram@gmail.com","Bsc", venue01);
		
	
	ResumeDao Dao=new ResumeDao();
	Dao.SaveDetails(dto);
	Dao.SaveDetails(dto01);
	
	System.out.println("-----------------Read----------");
	ResumeDto[] read=Dao.Read();
	 
	
	
		for(int j=0;j<read.length;j++) {
	  		if(read[j] != null)
	  		System.out.println( read[j]);
	    	 
	  	}
		System.out.println("-----------------SearchByName----------");    
		ResumeDto search=Dao.SearcByName("Venkatesh");
		System.out.println(search);
	
		System.out.println("-----------------SearchByMail----------");   
		ResumeDto searchmail=Dao.SearchByMail("venki123@gmail.com");
		System.out.println(searchmail);
		System.out.println("-----------------update degree by name----------");   
		
		Dao.UpdateDegreeByName("Ram", "M.E");
		ResumeDto[] read1=Dao.Read();
		 
		for(int j=0;j<read1.length;j++) {
	  		if(read1[j] != null)
	  		System.out.println( read1[j]);
		}
	  		
	  		System.out.println("-----------------update phonNo by mail----------");   
	  		
	  		Dao.UpdatePhoneNoBymail("venki123@gmail.com", 987234561l);
	  		
	  		ResumeDto[] read2=Dao.Read();
			 
			for(int j1=0;j1<read1.length;j1++) {
		  		if(read2[j1] != null)
		  		System.out.println( read2[j1]);
	  	         }
		
			System.out.println("----------------- Delete----------");   
			
			 boolean delete= Dao.DeleteN0byFathername("Harikrishnan");
			 System.out.println(delete);
			 ResumeDto[] read02=Dao.Read();
			 
				for(int j1=0;j1<read1.length;j1++) {
			  		if(read02[j1] != null)
			  		System.out.println( read02[j1]);
		  	         }
			 
	}
	
}
	
	
	
	
	
	
	


