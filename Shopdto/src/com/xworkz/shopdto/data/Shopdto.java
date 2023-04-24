package com.xworkz.shopdto.data;

public class Shopdto {

	private String name;
	private String city;
	private String ownername;
	private boolean isanybranch;
	private String branchname;
	private int noOfbranches;
	private String famousfor;
	private boolean havehomedelivery;
	private int shopsize;
	private int nooffloors;
	
	
	private boolean elevateravailable;
	private boolean haveescalator;
	private String paymentmode;
	private boolean iswholesaleavailable;
	private int sections;
	private float rating;
	private String reviews;
	private int noofworkers;
	private int noofmanager;
	private int  noofsupervisors;
	
	private String seniorworkername;
	private String managername;
	private String supervisorname;
	private String goodsbuyingfrom;
	private String veggiesbuyingfrom;
	private String fruitsbuyingfrom;
	private boolean usingplastic;
	private boolean legalrights;
	private boolean gstcharges;
	private String worktype;
	
	private int worktime;
	private int discount;
	private boolean anyoffers;
	private String offers;
	private String noofdeliverymen;
	private int workersalary;
	private int managersalary;
	private int supervisorsalary;
	private int driverssalary;
	private int deliverymansalary;
	
	private int typeofveggies;
	private int typeoffruits;
	private int typeofdiaryitems;
	private boolean qualitycheck;
	private int profit;
	private int previousyearprofit;
	private float profitpercentage;
	private String ratio;
	private boolean ispositiveratio;
	private int noofvehicles;
	
	private boolean havingparkingplace;
	private int noofsecurity;
	private String Headsecurityname;
	private int noofcameras;
	private boolean securitycamera;
	private int ratingrank;
	private int productqualityrank;
	private String quality;
	private String pricereview;
	private boolean isconvenientshopping; 
	
	 

	public Shopdto(  String name,String city, String ownername,boolean isanybranch, String branchname, 
    		int noOfbranches, String famousfor, boolean havehomedelivery, int shopsize,int nooffloors,
    		boolean elevateravailable, boolean haveescalator,String paymentmode, boolean iswholesaleavailable,int sections,
    		float rating, String reviews, int noofworkers, int noofmanager, int  noofsupervisors) {
    	this.name=name;
    	this.city=city;
    	this.ownername=ownername;
    	this.isanybranch=isanybranch;
    	this.branchname=branchname;
    	this.noOfbranches=noOfbranches;
    	this.famousfor=famousfor;
    	this.havehomedelivery=havehomedelivery;
    	this.shopsize=shopsize;
    	this.nooffloors=nooffloors;
    	this.elevateravailable=elevateravailable;
    	this.haveescalator=haveescalator;
    	this.paymentmode=paymentmode;
    	this.iswholesaleavailable=iswholesaleavailable;
    	this.sections=sections;
    	this.rating=rating;
    	this.reviews=reviews;
    	this.noofworkers=noofworkers;
    	this.noofmanager=noofmanager;
    	this.noofsupervisors=noofsupervisors;			
    			
    } 
     

    public String getname() {
		return name;
	}
    public String getcity() {
		return city;
	}
    public String getownername() {
		return  ownername;
	}
    public  boolean getbranch() {
		return isanybranch;
	}
    public String getbranchname() {
		return branchname;
	}
    
    
    
    
    public int getnumbranch() {
		return noOfbranches;
	}
    public String getfamous() {
		return famousfor;
	}
    public  boolean gethomedelivery() {
		return havehomedelivery;
	}
    public int getshopsize() {
		return shopsize;
	}
    public int getfloors() {
		return nooffloors;
	}
    
    public String getPaymentmode() {
		return paymentmode;
	}
	public boolean getisHaveescalator() {
		return haveescalator;
	}
	public boolean getisElevateravailable() {
		return elevateravailable;
	}
	public boolean isIswholesaleavailable() {
		return iswholesaleavailable;
	}
      public int getSections() {
	return sections;
}
	public float getRating() {
		return rating;
	}
	public int getNoofmanager() {
		return noofmanager;
	}
	public int getNoofsupervisors() {
		return noofsupervisors;
	}
	public int getNoofworkers() {
		return noofworkers;
	}
	public String getReviews() {
		return reviews;
	}
    // setters
	public void setname(String name) {
		this.name=name;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public void setownername(String ownername) {
		this.ownername=ownername;
	}
    public void setbranchname(String branchname) {
		this.branchname=branchname;
	}
    public void setbranch(boolean isanybranch) {
		this.isanybranch=isanybranch;
	}
    public void setnumbranch(int noOfbranches) {
		this.noOfbranches=noOfbranches;
	}
    public void setfamous(String famousfor) {
		this.famousfor=famousfor;
	}
    public void sethomedelivery(boolean  havehomedelivery) {
		this.havehomedelivery=havehomedelivery;
	}
    public void setsize(int  shopsize) {
		this.shopsize= shopsize;
	}
    public void setfloors(int  nooffloors) {
		this.nooffloors=nooffloors;
	}

    
	public void setElevateravailable(boolean elevateravailable) {
		this.elevateravailable = elevateravailable;
	}
	public void setHaveescalator(boolean haveescalator) {
		this.haveescalator = haveescalator;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	 
	public void setIswholesaleavailable(boolean iswholesaleavailable) {
		this.iswholesaleavailable = iswholesaleavailable;
	}

	public void setSections(int sections) {
		this.sections = sections;
	}
  
	public void setRating(float rating) {
		this.rating = rating;
	}
 
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
 
	public void setNoofworkers(int noofworkers) {
		this.noofworkers = noofworkers;
	}

	public void setNoofmanager(int noofmanager) {
		this.noofmanager = noofmanager;
	}
 
	public void setNoofsupervisors(int noofsupervisors) {
		this.noofsupervisors = noofsupervisors;
	}
 
	public String getSeniorworkername() {
		return seniorworkername;
	}
	 
	public void setSeniorworkername(String seniorworkername) {
		this.seniorworkername = seniorworkername;
	}
	 
	public String getManagername() {
		return managername;
	}
	 
	public void setManagername(String managername) {
		this.managername = managername;
	}
	 
	public String getSupervisorname() {
		return supervisorname;
	}
	 
	public void setSupervisorname(String supervisorname) {
		this.supervisorname = supervisorname;
	}
	
	public String getGoodsbuyingfrom() {
		return goodsbuyingfrom;
	}
	 
	public void setGoodsbuyingfrom(String goodsbuyingfrom) {
		this.goodsbuyingfrom = goodsbuyingfrom;
	}
	
	public String getVeggiesbuyingfrom() {
		return veggiesbuyingfrom;
	}
	 
	public void setVeggiesbuyingfrom(String veggiesbuyingfrom) {
		this.veggiesbuyingfrom = veggiesbuyingfrom;
	}
	 
	public String getFruitsbuyingfrom() {
		return fruitsbuyingfrom;
	}
	 
	public void setFruitsbuyingfrom(String fruitsbuyingfrom) {
		this.fruitsbuyingfrom = fruitsbuyingfrom;
	}
	 
	public boolean isUsingplastic() {
		return usingplastic;
	}
	 
	public void setUsingplastic(boolean usingplastic) {
		this.usingplastic = usingplastic;
	}
	 
	public boolean isLegalrights() {
		return legalrights;
	}
	 
	public void setLegalrights(boolean legalrights) {
		this.legalrights = legalrights;
	}
	 
	public boolean isGstcharges() {
		return gstcharges;
	}
	 
	public void setGstcharges(boolean gstcharges) {
		this.gstcharges = gstcharges;
	}
	 
	public String getWorktype() {
		return worktype;
	}
	 
	public void setWorktype(String worktype) {
		this.worktype = worktype;
	}
	public int getWorktime() {
		return worktime;
	}
	 
	public void setWorktime(int worktime) {
		this.worktime = worktime;
	}
	 
	public int getDiscount() {
		return discount;
	}
	 
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	 
	public boolean isAnyoffers() {
		return anyoffers;
	}
	public void setAnyoffers(boolean anyoffers) {
		this.anyoffers = anyoffers;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	 
	public String getNoofdeliverymen() {
		return noofdeliverymen;
	}
	public void setNoofdeliverymen(String noofdeliverymen) {
		this.noofdeliverymen = noofdeliverymen;
	}
	public int getWorkersalary() {
		return workersalary;
	}
	public void setWorkersalary(int workersalary) {
		this.workersalary = workersalary;
	}
	public int getManagersalary() {
		return managersalary;
	}
	public void setManagersalary(int managersalary) {
		this.managersalary = managersalary;
	}
	public int getSupervisorsalary() {
		return supervisorsalary;
	}
	public void setSupervisorsalary(int supervisorsalary) {
		this.supervisorsalary = supervisorsalary;
	}
	public int getDriverssalary() {
		return driverssalary;
	}
	public void setDriverssalary(int driverssalary) {
		this.driverssalary = driverssalary;
	}
	public int getDeliverymansalary() {
		return deliverymansalary;
	}
	 
	public void setDeliverymansalary(int deliverymansalary) {
		this.deliverymansalary = deliverymansalary;
	}
		  

	public int getTypeofveggies() {
		return typeofveggies;
	}
	public void setTypeofveggies(int typeofveggies) {
		this.typeofveggies = typeofveggies;
	}
	public int getTypeoffruits() {
		return typeoffruits;
	}
	public void setTypeoffruits(int typeoffruits) {
		this.typeoffruits = typeoffruits;
	}
	public int getTypeofdiaryitems() {
		return typeofdiaryitems;
	}
	public void setTypeofdiaryitems(int typeofdiaryitems) {
		this.typeofdiaryitems = typeofdiaryitems;
	}
	public boolean  getisQualitycheck() {
		return qualitycheck;
	}
	public void setQualitycheck(boolean qualitycheck) {
		this.qualitycheck = qualitycheck;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public int getPreviousyearprofit() {
		return previousyearprofit;
	}
	public void setPreviousyearprofit(int previousyearprofit) {
		this.previousyearprofit = previousyearprofit;
	}
	public float getProfitpercentage() {
		return profitpercentage;
	}
	public void setProfitpercentage(float profitpercentage) {
		this.profitpercentage = profitpercentage;
	}
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	public boolean getisIspositiveratio() {
		return ispositiveratio;
	}
	public void setIspositiveratio(boolean ispositiveratio) {
		this.ispositiveratio = ispositiveratio;
	}
	public int getNoofvehicles() {
		return noofvehicles;
	}
	public void setNoofvehicles(int noofvehicles) {
		this.noofvehicles = noofvehicles;
	}
	public boolean getisHavingparkingplace() {
		return havingparkingplace;
	}
	public void setHavingparkingplace(boolean havingparkingplace) {
		this.havingparkingplace = havingparkingplace;
	}
	public int getNoofsecurity() {
		return noofsecurity;
	}
	public void setNoofsecurity(int noofsecurity) {
		this.noofsecurity = noofsecurity;
	}
	public String getHeadsecurityname() {
		return Headsecurityname;
	}
	public void setHeadsecurityname(String headsecurityname) {
		Headsecurityname = headsecurityname;
	}
	public int getNoofcameras() {
		return noofcameras;
	}
	public void setNoofcameras(int noofcameras) {
		this.noofcameras = noofcameras;
	}
	public boolean getisSecuritycamera() {
		return securitycamera;
	}
	public void setSecuritycamera(boolean securitycamera) {
		this.securitycamera = securitycamera;
	}
	public int getRatingrank() {
		return ratingrank;
	}
	public void setRatingrank(int ratingrank) {
		this.ratingrank = ratingrank;
	}
	public int getProductqualityrank() {
		return productqualityrank;
	}
	public void setProductqualityrank(int productqualityrank) {
		this.productqualityrank = productqualityrank;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getPricereview() {
		return pricereview;
	}
	public void setPricereview(String pricereview) {
		this.pricereview = pricereview;
	}
	public boolean getisIsconvenientshopping() {
		return isconvenientshopping;
	}
	public void setIsconvenientshopping(boolean isconvenientshopping) {
		this.isconvenientshopping = isconvenientshopping;
	} 
		 

	
	
	
}
