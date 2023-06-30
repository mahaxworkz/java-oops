package com.xworkz.employerlist.Dao;

public interface EmployeeDao {
	public String Save( String name,String name1,String name2,String name3,String name4);
	public Boolean deleteByIndex(int x) throws ValueNotValidException;
	public Boolean deleteByValue(String val);
	public String read();
	public Boolean update(int n,String value);

}
