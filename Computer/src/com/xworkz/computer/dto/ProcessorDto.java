package com.xworkz.computer.dto;

public class ProcessorDto {
	
     String processorBrand;
     String Generation;
     String model;
     int Ram;
     int Rom;
	public ProcessorDto(String processorBrand, String generation, String model, int ram, int rom) {
		super();
		this.processorBrand = processorBrand;
		Generation = generation;
		this.model = model;
		Ram = ram;
		Rom = rom;
	}
	 
	public String toString() {
		return "ProcessorDto [processorBrand=" + processorBrand + ", Generation=" + Generation + ", model=" + model
				+ ", Ram=" + Ram + ", Rom=" + Rom + "]";
	}
	
	

}
