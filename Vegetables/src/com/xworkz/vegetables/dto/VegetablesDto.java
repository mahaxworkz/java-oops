package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constant.VegType;

public class VegetablesDto {
	
	private String name;
	private int price;
	private NutrientsDto nuterients;
	private VegType type;
	private int size;
	private String colour;
	public VegetablesDto(String name, int price, NutrientsDto nuterients, VegType type, int size, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.nuterients = nuterients;
		this.type = type;
		this.size = size;
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public NutrientsDto getNuterients() {
		return nuterients;
	}
	public void setNuterients(NutrientsDto nuterients) {
		this.nuterients = nuterients;
	}
	public VegType getType() {
		return type;
	}
	public void setType(VegType type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "VegetablesDto [name=" + name + ", price=" + price + ", nuterients=" + nuterients + ", type=" + type
				+ ", size=" + size + ", colour=" + colour + "]";
	}
	
	
	
	

}
