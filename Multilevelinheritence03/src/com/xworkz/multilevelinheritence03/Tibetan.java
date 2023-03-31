package com.xworkz.multilevelinheritence03;

public class Tibetan extends Dogs{
	
    public void Traintibetan() {
    	System.out.println("these dogs are tough to train");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Tibetan tib =new Tibetan();
       tib.Playing();
       tib.Eating();
       tib.Catagorizing();
       tib.Traintibetan();
	}

}
