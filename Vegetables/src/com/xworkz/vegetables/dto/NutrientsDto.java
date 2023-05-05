package com.xworkz.vegetables.dto;

public class NutrientsDto {
	private String vitamin;
	private String benefit;
	private int amountofnutrients;
	public NutrientsDto(String vitamin, String benefit, int amountofnutrients) {
		super();
		this.vitamin = vitamin;
		this.benefit = benefit;
		this.amountofnutrients = amountofnutrients;
	}
	public String getVitamin() {
		return vitamin;
	}
	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}
	public String getBenefit() {
		return benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	public int getAmountofnutrients() {
		return amountofnutrients;
	}
	public void setAmountofnutrients(int amountofnutrients) {
		this.amountofnutrients = amountofnutrients;
	}
	@Override
	public String toString() {
		return "NutrientsDto [vitamin=" + vitamin + ", benefit=" + benefit + ", amountofnutrients=" + amountofnutrients
				+ "]";
	}
	 

}
