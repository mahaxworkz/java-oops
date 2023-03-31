package com.xworkz.oopsprogramming;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cardiologiest Cardio= new Cardiologiest(8,9);
       //parent class
        Cardio.Diagonise_disease();
        Cardio.Provide_treatement();
        Cardio.Counseling();
     System.out.println(Cardio.courseduration);
     System.out.println(Cardio.workinghours);
            Cardio.do_surgery();
            Cardio.diagonize_heart();
           
           //Neurologiest//
     Neurologiest Neuro =new Neurologiest("NerveSysteam","PSG medical college");
     System.out.println(Neuro.graduationfrom);
     System.out.println(Neuro.SpecializedField);
        Neuro.diagonize_brain();
        Neuro.treatement_brain();
        //uro
        Urologist urenery=new Urologist(100000,true);
        System.out.println(urenery.dosurgery);
        System.out.println(urenery.Salary);
          urenery.doing_procedures();
          urenery.treatment();
	}

}
