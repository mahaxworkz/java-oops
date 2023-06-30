package com.xworkz.employerlist.Dao;

import java.util.ArrayList;

public class EmployeeImpl  implements EmployeeDao {
     ArrayList<String> Employee = new ArrayList<String>();
	@Override
	public String Save(String name,String name1,String name2,String name3,String name4) {
		 Employee.add(name);
		 Employee.add(name1);	 
		 Employee.add(name2);
		 Employee.add(name3);
		 Employee.add(name4);
		System.out.println("saved");
		 
		return null;
	}

	 

	@Override
	public String read() {
		 for(String obj: Employee) {
			 System.out.println(obj);
		 }
		return null;
	}

	@Override
	public Boolean update(int n,String value) {
		String updating= Employee.set(n, value);
		System.out.println(updating);
		read();
		return null;
	}

	@Override
	public Boolean deleteByIndex(int x) throws ValueNotValidException {
		try {
			if(x<0) {
				String delete =Employee.remove(x);
				
				System.out.println(delete);
				read();
			}
			else {
				throw new ValueNotValidException("check the given value");
			}
		} catch (ValueNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean deleteByValue(String val) {
	Boolean	delete01= Employee.remove(val);
	System.out.println(delete01);
	read();
		 
		return null;
	}

}
