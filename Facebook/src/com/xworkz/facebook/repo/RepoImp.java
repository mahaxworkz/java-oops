package com.xworkz.facebook.repo;



 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.facebook.dto.FacebookDto;

public class RepoImp implements Repository  {

	@Override
	public boolean save(FacebookDto dto) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123");
		 System.out.println(connect);
		 System.out.println("database connected");
		 String query = "insert into  facebook values (?,?,?,?,?,?,?,? )";
		 PreparedStatement statement= connect.prepareStatement(query);
		 System.out.println("inserted data" +statement);
		 
		 statement. setInt(1,dto.getId());
		 statement.setString(2,dto.getFirstname());
		 statement.setString(3,dto.getLastname());
		 statement.setString(4,dto.getDOB());
		 statement.setString(5,dto.getMail());
		 statement.setLong(6, dto.getPhoneNo());
		 statement.setString(7,dto.getGender());
		 statement.setString(8,dto.getPassword() );
		 int i= statement.executeUpdate();
		 System.out.println("insert into :" +i);
		 
		 
		   statement.close();
		return false;
	}

	@Override
	public ResultSet read(FacebookDto dto) throws Exception {
		 
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123") ;
			 String query = "select * from facebook " ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			  
			  ResultSet result =statement.executeQuery();
			  
			  if (result != null) {
					while(result.next()) {
						 
						System.out.println(result.getString(1) + "" + result.getString(2) + "" + result.getString(3) + "" + result.getString(4)
						+ "" + result.getString(5) + "" + result.getString(6) + "" + result.getLong(6)+ "" + result.getString(7)+ "" + result.getString(8));
					}
				}			 
			  con.close();
		  
		return null;
	}

	@Override
	public boolean update(String mail,int id) throws Exception {
		 
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123") ;
			 String query = "update facebook set email = ? where id =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			 statement.setInt(2,id);
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("updated");
			 }else {
				 System.out.println("error occured");
			 }
			 
			  con.close();
		return false;
	}

	@Override
	public boolean delete(String mail ) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123") ;
			 String query = "delete from facebook where email = ?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			  
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("deleted");
			 }else {
				 System.out.println("error occured");
			 }
			 
			  con.close();
		return false;
	}

	@Override
	public ResultSet readbymail(FacebookDto dto, String mail) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123") ;
			 String query = "select * from facebook where email=? " ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			  
			  ResultSet result =statement.executeQuery();
			  
			  if (result != null) {
					while(result.next()) {
						 
						System.out.println(result.getString(1) + "" + result.getString(2) + "" + result.getString(3) + "" + result.getString(4)
						+ "" + result.getString(5) + "" + result.getString(6) + "" + result.getLong(6)+ "" + result.getString(7)+ "" + result.getString(8));
					}
				}			 
			  con.close();
		return null;
	}

	@Override
	public boolean update(FacebookDto dto,String mail,String firstname,String lastname,String DOB,int id) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123") ;
			 String query = "update facebook set email = ?,  firstname=?,  lastname=?,  DOB=? where id = ?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			 statement.setString(2,firstname);
			 statement.setString(3,lastname);
			 statement.setString(4,DOB);
			 statement.setInt(5,id);
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("updated");
			 }else {
				 System.out.println("error occured");
			 }
			 
			  con.close();
		return false;
	}

	@Override
	public boolean delete01(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/media","root","Xworkzodc@123") ;
		 String query = "delete from facebook where id = ?" ;
		 PreparedStatement statement= con.prepareStatement(query);
		 
		 statement.setInt(1,id);
		  
		  
		int i = statement.executeUpdate();
		 if(i>0) {
			 System.out.println("deleted");
		 }else {
			 System.out.println("error occured");
		 }
		 
		  con.close();
		return false;
	}

}
