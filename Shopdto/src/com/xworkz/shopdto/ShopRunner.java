package com.xworkz.shopdto;

import com.xworkz.shopdto.data.Shopdto;

public class ShopRunner {

	public static void main(String[] args) {
		 Shopdto dto= new Shopdto("Saravana Stores","chennai" ,"Saravanan", true, "trichy",
				 5, "legend", true, 60000, 5, 
				 true, true, "online",true, 12,
				 8f,"good" ,2000,25, 5);
		 
       dto.setAnyoffers(true);
       dto.setDeliverymansalary(20000);
       dto.setDiscount(30);
       dto.setDriverssalary(25000);;
       dto.setFruitsbuyingfrom("koyambet");
       dto.setGoodsbuyingfrom("ebay");
       dto.setGstcharges(true);
       dto.setHavingparkingplace(true); 
       dto.setHeadsecurityname("mani");
       dto.sethomedelivery(true);
       
       dto.setWorktype("fulltime");
       dto.setWorktime(6);
       dto.setWorkersalary(15000);
       dto.setVeggiesbuyingfrom("koyambed");
       dto.setUsingplastic(false);
       dto.setTypeofveggies(20);
       dto.setTypeoffruits(20);
       dto.setTypeofdiaryitems(15);
       dto.setSupervisorsalary(25000);
       dto.setSupervisorname("ganapathy");
       
       dto.setSeniorworkername("malar");
       dto.setSecuritycamera(true);
       dto.setSections(12);
       dto.setRatio("9");
       dto.setQualitycheck( true);
       dto.setQuality("good");
       dto.setProfitpercentage(6);
       dto.setProfit(68);
       dto.setProductqualityrank(7);
       dto.setPreviousyearprofit(57);
       
       dto.setNoofcameras(30);
       dto.setNoofdeliverymen("100");
       dto.setNoofmanager(5);
       dto.setNoofsecurity(10);
       dto.setIspositiveratio(true);
       dto.setNoofvehicles(18);
       dto.setLegalrights( true);
       dto.setManagername("bala");
       dto.setIswholesaleavailable(true);
       dto.setIsconvenientshopping(true);
       
        System.out.println(dto.getbranch());
        System.out.println(dto.getbranchname());
        System.out.println(dto.getcity());
        System.out.println(dto.getDeliverymansalary());
        System.out.println(dto.getDiscount());
        System.out.println(dto.getDriverssalary());
        System.out.println(dto.getfamous());
        System.out.println(dto.getfloors());
        System.out.println(dto.getFruitsbuyingfrom());
        System.out.println(dto.getGoodsbuyingfrom());
        
        System.out.println(dto.getHeadsecurityname());
        System.out.println(dto.gethomedelivery());
        System.out.println(dto.getisElevateravailable());
        System.out.println(dto.getisHaveescalator());
        System.out.println(dto.getisHavingparkingplace());
        System.out.println(dto.getisIsconvenientshopping());
        System.out.println(dto.getisIspositiveratio());
        System.out.println(dto.getisQualitycheck());
        System.out.println(dto.getisSecuritycamera());
        System.out.println(dto.getManagername());
        
        System.out.println(dto.getManagersalary());
        System.out.println(dto.getname());
        System.out.println(dto.getnumbranch());
        System.out.println(dto.getNoofcameras());
        System.out.println(dto.getNoofdeliverymen());
        System.out.println(dto.getNoofmanager());
        System.out.println(dto.getNoofsecurity());
        System.out.println(dto.getNoofsupervisors());
        System.out.println(dto.getNoofvehicles());
        System.out.println(dto.getNoofworkers());
        
        System.out.println(dto.getOffers());
        System.out.println(dto.getownername());
        System.out.println(dto.getPaymentmode());
        System.out.println(dto.getPreviousyearprofit());
        System.out.println(dto.getPricereview());
        System.out.println(dto.getProductqualityrank());
        System.out.println(dto.getProfit()); 
        System.out.println(dto.getProfitpercentage()); 
        System.out.println(dto.getQuality());
        System.out.println(dto.getisQualitycheck());
        
        System.out.println(dto.getRating());
        System.out.println(dto.getRatingrank());
        System.out.println(dto.getRatio());
        System.out.println(dto.getReviews());
        System.out.println(dto.getshopsize());
        System.out.println(dto.getSections());
        System.out.println(dto.getSeniorworkername());
        System.out.println(dto.getSupervisorname());
        System.out.println(dto.getSupervisorsalary());
        System.out.println(dto.getisSecuritycamera());
       
        System.out.println(dto.getTypeofdiaryitems());
        System.out.println(dto.getTypeoffruits());
        System.out.println(dto.getTypeofveggies());
        System.out.println(dto.getVeggiesbuyingfrom());
        System.out.println(dto.getWorktype());
        System.out.println(dto.getWorkersalary());
        System.out.println(dto.getGoodsbuyingfrom());
        System.out.println(dto.getQuality());
        System.out.println(dto.getWorktime());
        System.out.println(dto.getisIspositiveratio());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
