package com.xworkz.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		//1)impliciting  datatype-byte
		byte small;
		short big=12;
		small= (byte)big;
		System.out.println(small);
		
       //exliciting data type
		byte Small =5;
		short Big;
		Big=Small;
		System.out.println(Big);
		
		//2) impliciting datatype -short
		 short length;
		 int area=1500;
		 length=(short)area;
		 System.out.println(length);
		
		 // expliciting datatype
		 short Length = 35;
		 int Area;
		 Area=length;
		 System.out.println(Area);
		 
		 //3) impliciting datatype-int
		 int temp;
		 float celcius=98.6f;
		 temp =(int)celcius;
		 System.out.println(temp);
		 
		 // expliciting datatype
		 int temperature=108;
		 float degree;
		 degree=temperature;
		 System.out.println(degree);
		 
		 //4) impliciting datatype -float
		 float discount;
		 double price= 1000.45d;
		discount= (float)price;
		System.out.println(discount);
		
		// explictinng datatype
		float Discount=99.9f;
		double Price;
		Price=Discount;
		System.out.println();
		
		// 5) impliciting datatype -double
		double AreainMeterSQ;
		long population=450000000;
		AreainMeterSQ=(double)population;
		System.out.println(AreainMeterSQ);
		
		// expliciting datatype
		float areasize=13000.9f;
		double Population;
		Population =areasize;
		System.out.println(Population);
		
		 //6) impliciting datatype-long
		 int percentage;
		 long profit=1900;
		 percentage =(int)profit;
		 System.out.println(profit);
		 
		 // expliciting datatype
		 int Shareamount=15000;
		 long total;
		 total=Shareamount;
		 System.out.println(total);
		
		 
		 /////
		// expliciting datatype
			double x=13000.9d;
			long y;
			y=(long)x;
			System.out.println(y);
		 
	}

}