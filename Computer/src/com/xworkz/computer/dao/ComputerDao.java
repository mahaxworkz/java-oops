package com.xworkz.computer.dao;

import com.xworkz.computer.dto.ComputerDto;
import com.xworkz.computer.dto.ProcessorDto;

public class ComputerDao {
	
	ComputerDto[] computerarray =new ComputerDto[10];
	
	
	public  ComputerDto[] SaveDetails( ComputerDto dto) {
		if (dto != null) {
			for (int i = 0; i <  computerarray.length; i++) {
				if (computerarray[i] == null) {
					computerarray[i] = dto;
					System.out.println(" Data added ");
					return computerarray;
				}
				System.out.println("The index have some value");
			}
			System.out.println("All index contains some data");
			return computerarray;
		}
		System.out.println("The data is null  ");
		return computerarray;

	}
	
	public ComputerDto[] read() {
		return computerarray;
	}
	public ComputerDto FindpriceByBrand(String brand )  {
		
		if(brand!=null) {
			for(int i=0;i<computerarray.length;i++) {
				if(computerarray[i].getBrand().equals(brand)) {
					computerarray[i].getPrice();
					System.out.println("price found");
					return computerarray[i];
				}
				System.out.println("brandname is not found,so i++");
			}
			System.out.println("brandname is not found");
			return null;
		}
		System.out.println("brandname is not valid ,it is null");
		
		return null;
		
	}
	
public  boolean updatemodelbybrand(String model ,String brand)  {
		
		if(model!=null) {
			for(int i=0;i<computerarray.length;i++) {
				if(computerarray[i].getModel().equals(model)) {
					computerarray[i].setBrand(brand);;
					System.out.println(" brand updated");
					return  true;
				}
				System.out.println(" model is not found,so i++");
			}
			System.out.println(" model  is not found");
			return  false;
		}
		System.out.println(" model is not valid ,it is null");
		
		return false;
		
	}

public boolean delete(String colour ) {
	if(colour!=null) {
		for(int i=0;i<computerarray.length;i++) {
              if(computerarray[i]!=null) {
            	  if(computerarray[i].getColour().equals( colour)) {
      				computerarray[i].setBrand(null);
      				computerarray[i].setColour(null);
      				computerarray[i].setCore(null);
      				computerarray[i].setModel(null);
      				computerarray[i].setPrice(0);
      				computerarray[i].setProcessor(null);
      				System.out.println("  price deleted");
      				return  true;
      			}
      			System.out.println(" colour is not found,so i++");
      		}
			}
			
		System.out.println("  colour  is not found");
		return  false;
	}
	System.out.println("  colour is not valid ,it is null");
	
	
	return false;
}


public boolean delete01(String colour ) {
	if(colour!=null) {
		for(int i=0;i<computerarray.length;i++) {
              if(computerarray[i]!=null) {
            	  if(computerarray[i].getColour().equals( colour)) {
      				 computerarray[i]= null;
      				System.out.println("  price deleted");
      				return  true;
      			}
      			System.out.println(" colour is not found,so i++");
      		}
			}
			
		System.out.println("  colour  is not found");
		return  false;
	}
	System.out.println("  colour is not valid ,it is null");
	
	
	return false;
}


public  boolean updateprocessbybrand( ProcessorDto pro,String brand)  {
	
	if(brand!=null) {
		for(int i=0;i<computerarray.length;i++) {
			if(computerarray[i].getBrand().equals(brand)) {
				computerarray[i].setProcessor(pro) ;
				System.out.println(" brand updated");
				return  true;
			}
			System.out.println(" model is not found,so i++");
		}
		System.out.println(" model  is not found");
		return  false;
	}
	System.out.println(" model is not valid ,it is null");
	
	return false;
	
}









	

}
