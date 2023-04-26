package com.xworkz.restaurant;

import com.xworkz.restaurant.dao.RestaurantDAO;

public class Runner {

	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RestaurantDAO hotel=  new RestaurantDAO();
     
     hotel.Savestring("idly");
     hotel.Savestring("Dosa");
     hotel.Savestring("poori");
     hotel.Savestring("po");
     
      hotel.readhotel();
      
    
     
	}

}
