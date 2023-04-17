package com.xworkz.oopacessspecifiers;

public class College {
	public   String collegename="SSEC";
	public int collegecode=7136;
	private static String state="Tamilnadu";
	private static String district="Coimbatore";
	 String type="Engineering";
	 int year=4;
	static protected byte sem=8;
	static protected byte project=2;
	
	
	
	// creating public method
	public static   void Applying(){
		admission();
		
		 
	}
	
	// creating private method
	private static void admission() {
		 
		System.out.println( "state is" +state);
		System.out.println("District is" + district);
	}
		//creating default method 
		  void Choosecourse() {
			 
			System.out.println( "course is" +type);
			System.out.println( "duration" +year);
		}
		//creating protected method
	 protected static void  Performance() {
		 
		 System.out.println( " sem:" + sem);
		 System.out.println( " no of project :" + project);
	 }
	
	

}
