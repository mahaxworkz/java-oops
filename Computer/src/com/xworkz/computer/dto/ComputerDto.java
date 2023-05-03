package com.xworkz.computer.dto;

public class ComputerDto {
	private String Model;
	private String Brand;
	private String Colour;
	private int price;
	private ProcessorDto processor;
	private Type core;
	public ComputerDto(String model, String brand, String colour, int price, ProcessorDto processor, Type core) {
		super();
		Model = model;
		Brand = brand;
		Colour = colour;
		this.price = price;
		this.processor = processor;
		this.core = core;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ProcessorDto getProcessor() {
		return processor;
	}
	public void setProcessor(ProcessorDto processor) {
		this.processor = processor;
	}
	public Type getCore() {
		return core;
	}
	public void setCore(Type core) {
		this.core = core;
	}
	 
	public String toString() {
		return "ComputerDto [Model=" + Model + ", Brand=" + Brand + ", Colour=" + Colour + ", price=" + price
				+ ", processor=" + processor + ", core=" + core + "]";
	}
	
	

}
