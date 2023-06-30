package com.xworkz.employerlist;

import com.xworkz.employerlist.Dao.EmployeeDao;
import com.xworkz.employerlist.Dao.EmployeeImpl;
import com.xworkz.employerlist.Dao.ValueNotValidException;

public class Runner {

	public static void main(String[] args) throws ValueNotValidException {
		// TODO Auto-generated method stub
		
		EmployeeDao dao= new EmployeeImpl();
		System.out.println("----save---");
		 dao.Save("luffy", "Baki", "Hujiro", "joro", "nami");
		 System.out.println("----read---");
		dao.read();
		System.out.println("----update---");
		dao.update(2, "chopper");
		
		System.out.println("----deleteby value---");
		dao.deleteByValue("joro");
		System.out.println("----deleteby index---");
		dao.deleteByIndex(3);
		

	}

}
