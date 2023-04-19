package com.xworkz.families;

import com.xworkz.families.data.FamilyData;

public class Managefamily {

	public static void main(String[] args) {
		FamilyData family = new FamilyData("Onepiece Family",10, true,(long)300000000,"Luffy");
		System.out.println(family);

		FamilyData anime = new FamilyData("Onepiece Family",10, true,(long)300000000,"Luffy");
		 
		//equals
		System.out.println(family.equals(anime));
	}

}
