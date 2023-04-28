package com.xworkz.movies.dao;

import com.xworkz.movies.dto.Moviesdto;

public class Moviedao {
	
	Moviesdto[] movieinfo= new Moviesdto[15];
	
	public Moviesdto[]  saveinfo(Moviesdto film) {
		    if(film !=null) {
		    	for (int i=0;i<movieinfo.length;i++) {
		    		if(movieinfo[i]== null) {
		    			movieinfo[i] = film;
		    			System.out.println("the values are added \n "+ film);
				    	return movieinfo;
		    		}
		    		
		    		System.out.println(" the array have some values,So can't save the value");
			    	return movieinfo;
		   	
		    	}
		    	System.out.println("the film must be null");
		    	return movieinfo;
		    }
	
		
		System.out.println("the film must be null");
		return movieinfo;
			
	}
	public Moviesdto[] readinfo() {
		return movieinfo;
		
	}
	

}
