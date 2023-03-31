package com.xworkz.multilevelinheritance02;

public class LedTV extends Television {
      public LedTV() {
    	  System.out.println("LED TV");
      }
	public void Display() {
		System.out.println("better picture Quality");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LedTV tv=new LedTV();
          tv.Display();
          tv.Devicetype();
	}

}
