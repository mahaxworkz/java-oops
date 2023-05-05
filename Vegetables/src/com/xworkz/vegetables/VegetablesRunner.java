package com.xworkz.vegetables;

import com.xworkz.vegetables.constant.VegType;
import com.xworkz.vegetables.dao.VegetablesDao;
import com.xworkz.vegetables.dto.NutrientsDto;
import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesRunner {

	public static void main(String[] args) {
		
		NutrientsDto health=new NutrientsDto("vitamin b","good for musclular growth",25);
		VegetablesDto	Dto= new VegetablesDto("Spinach", 30, health,VegType.LEAFVEGGIES , 6,"green");
		VegetablesDao Dao= new VegetablesDao();
		
		 boolean Add=Dao.AddVeggiesToCart(Dto);
		 
		 System.out.println(Add);
		
		VegetablesDto[] View=Dao.ViewCart();
		for (int i=0;i<View.length;i++) {
			System.out.println(View[i]);
		}
		System.out.println("------------find-------");
		boolean Find=Dao.FindByName("Spinach");
		VegetablesDto[] view=Dao.ViewCart();
		for (int i=0;i<view.length;i++) {
			System.out.println(view[i]);
		}
		
		System.out.println("------------delete-------");
		boolean delete =Dao.DeleteByName("Spinach");
		System.out.println(delete);
		VegetablesDto[] View1=Dao.ViewCart();
		for (int i=0;i< View1.length;i++) {
			System.out.println(View1[i]);
		}
		 
		
	}
	
	
}
