package com.xworkz.aggregation;

public class Hospital {
	String hospitalname;
	long contact;
	Doctors doctor;
	Employee emp;
	Treatment curing;
	Patients patient;
	
	public Hospital(String hospitalname,long contact,Doctors doctor,Employee emp,Treatment curing,Patients patient) {
		this.hospitalname= hospitalname;
		this.contact=contact;
		this.doctor= doctor;
		this.emp= emp;
		this.curing=curing;
	    this.patient=patient;
	}
    public static void main (String[] args) {
    	Doctors doc=new Doctors(2003,"Arun","Cardiologist",5,"Indhustan medical college");  
    	Employee emp=new Employee(1231,"lisa","nurse",8,2);
    	Treatment treatment=new Treatment("drugproving","TylerKent",90,"Abdhul",43000);
    	Patients patient=new Patients(25,"fuji",8236457823l,"asthuma",true);
    	
    	Hospital hos =new Hospital("PSG",273458912l,doc,emp,treatment,patient);
    	 
    	 System.out.println(hos.hospitalname);
    	 System.out.println(hos.contact);
    	 
    	 System.out.println(doc.id);
    	 System.out.println(doc.name);
    	 System.out.println(doc.specialization);
    	 System.out.println(doc.experience);
    	 System.out.println(doc.graduatefrom);
    	 
    	 System.out.println(emp.empid);
    	 System.out.println(emp.empname);
    	 System.out.println(emp.worktype);
    	 System.out.println(emp.noofshifts);
    	 System.out.println(emp.workinghour);
    	 
    	 System.out.println(treatment.eqipmentname);
    	 System.out.println(treatment.cost);
    	 System.out.println(treatment.days);
    	 System.out.println(treatment.treatingdoctor);
    	 System.out.println(treatment.treatmentname);
    	 
    	 System.out.println(patient.attenderno);
    	 System.out.println(patient.disease);
    	 System.out.println(patient.mobileno);
    	 System.out.println(patient.name);
    	 System.out.println(patient.wanttoadmit);
    	 
    	 
    	 
    	 
    }
	 
	
	 
	}


