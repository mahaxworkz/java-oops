package com.xworkz.aggregation;

public class Treatment {
	String treatmentname;
	String eqipmentname;
	int days;
	String treatingdoctor;
	int cost;
	public Treatment(String treatmentname,String equipmentname,int days,String treatingdoctor,int cost) {
		this.eqipmentname=treatmentname;
		this.cost=cost;
		this.days=days;
		this.treatingdoctor=treatingdoctor;
		this.eqipmentname=equipmentname;
	}

}
