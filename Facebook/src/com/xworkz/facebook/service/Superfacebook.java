package com.xworkz.facebook.service;

import java.sql.ResultSet;

import com.xworkz.facebook.dto.FacebookDto;

public interface Superfacebook {
	
	boolean ValidateSave(FacebookDto dto) throws Exception;
	  boolean update(String mail,int id) throws Exception;
	ResultSet readDto (FacebookDto dto) throws Exception;
	public boolean Deleting(String mail ) throws Exception;
	ResultSet readDto01(FacebookDto dto,String mail) throws Exception;
	boolean update01(FacebookDto dto,String mail,String firstname,String lastname,String DOB,int id ) throws Exception ;
	public boolean delete01(int id) throws Exception;

}
