package com.xworkz.facebook.repo;

import java.sql.ResultSet;

 
import com.xworkz.facebook.dto.FacebookDto;

public interface Repository {
	
	boolean save(FacebookDto dto) throws Exception ;
	boolean update(String mail,int id) throws Exception ;
	boolean update(FacebookDto dto,String mail,String firstname,String lastname,String DOB,int id ) throws Exception ;
	ResultSet read(FacebookDto dto) throws Exception;
	ResultSet readbymail(FacebookDto dto,String mail) throws Exception;
	boolean delete(String mail ) throws Exception ;
	boolean delete01(int id ) throws Exception ;
	
}
