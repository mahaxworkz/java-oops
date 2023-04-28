package com.xworkz.movies.dto;

public class Moviesdto {
	private String moviename;
	private String catagory;
	private float rating;
	private String director;
	private long budget;
	private String hero;
	private String villains;
	  private static String[] casting;
	  
	  
	  
	  public Moviesdto(String moviename,String catagory,float rating,String director,long budget,String hero,String villains) {
		  this.moviename=moviename;
		  this.catagory=catagory;
		  this.rating=rating;
		  this.budget=budget;
		  this.director=director;
		  this.hero=hero;
		  this.villains=villains;
		  
	  }

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public  static  String[] getCasting() {
		return casting;
	}

	public void setCasting(String[] casting) {
		Moviesdto.casting = casting;
	}

	@Override
	public String toString() {
		return "moviename=" + moviename + ", catagory=" + catagory + ", rating=" + rating + ", director="
				+ director + ", budget=" + budget + ", hero=" + hero + ", villains=" + villains ;
	}
	 
	 
	
}