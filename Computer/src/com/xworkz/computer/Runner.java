package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDao;
import com.xworkz.computer.dto.ComputerDto;
import com.xworkz.computer.dto.ProcessorDto;
import com.xworkz.computer.dto.Type;

public class Runner {

	public static void main(String[] args) {
		
		ProcessorDto pro=new ProcessorDto("Duel core", "3gen", "Duel", 1, 50);
		 ComputerDto computer=new ComputerDto("Elitebook", "HP", "black", 36000, pro, Type.Coretwo);
		 
		 ProcessorDto pro01=new ProcessorDto("Duel core", "5gen", "Duel", 2, 50);
		 ComputerDto computer01=new ComputerDto("Macbook", "Apple", "white", 55000, pro01, Type.Coreone);
		 
		 ProcessorDto procore=new ProcessorDto("Duel core", "6gen", "core", 3, 60);
		 
		 ComputerDao Dao=new ComputerDao();
		 
		 Dao.SaveDetails(computer);
		 Dao.SaveDetails(computer01);
		 
		 System.out.println("------------Read--------");
		ComputerDto[] read= Dao.read();
		
		for(int i=0;i<read.length;i++) {
			if(read[i]!=null) {
			System.out.println(read[i]);
			}
		}
		
		System.out.println("------------FindByBrand--------"); 
		ComputerDto search=Dao.FindpriceByBrand("HP");
		ComputerDto[] read01= Dao.read();
		for(int i=0;i<read01.length;i++) {
			if(read[i]!=null) {
			System.out.println(read01[i]);
			}
		
	}
		
		System.out.println("------------update--------"); 
		 
		 boolean searching=Dao.updatemodelbybrand("Macbook", "Macbook");
		 ComputerDto[] read02= Dao.read();
		for(int i=0;i<read02.length;i++) {
			if(read02[i]!=null) {
			System.out.println(read02[i]);
			}
		
	
	}
		/*
		System.out.println("------------ delete--------"); 
		Dao.delete("Black");
		 ComputerDto[] read03= Dao.read();
			for(int i=0;i<read03.length;i++) {
				if(read02[i]!=null) {
				System.out.println(read03[i]);
				}
		
	}
			
			
			System.out.println("------------ delete02--------"); 
			Dao.delete01("white");
			 ComputerDto[] read04= Dao.read();
				for(int i=0;i<read04.length;i++) {
					if(read04[i]!=null) {
					System.out.println(read04[i]);
					}
			
		}
*/
				System.out.println("------------update--------"); 
				 
				 boolean update=Dao.updateprocessbybrand(  procore, "Macbook");
				 ComputerDto[] A= Dao.read();
				for(int i=0;i< A.length;i++) {
					if( A[i]!=null) {
					System.out.println( A[i]);
					}	
			
			
			}
}}
