package com.xworkz.movies;

import com.xworkz.movies.dao.Moviedao;
import com.xworkz.movies.dto.Moviesdto;

public class Runner {

	public static void main(String[] args) {
		Moviesdto film = new Moviesdto("Rurouni Kenshin ", "action", 8.9f,"Keishi ottomo" , 120000000,"rurouni kensin Batosoi","makato");
		Moviedao info=new Moviedao();
      System.out.println(film);
     
      info.saveinfo(film);
       
      System.out.println("------------------------");
  	Moviesdto[] information= info.readinfo();
  	 
  	
  	for(int j=0;j<information.length;j++) {
  		if(information[j] != null)
  		System.out.println( information[j]);
    	 
  	}
      
      
      
      
	}

}
