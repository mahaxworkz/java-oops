package com.xworkz.controlflow;

public class Loop {
	
	public static void main(String[] args) {
		// creating array using literals
		 int[] regno = {1001,1002,1003,1004,1005,1016,1017,1018,1029,1023};
		 String[] Name = {"fuji","luffy","chopper","ace","jain","saitama","itachi","jack","takashi","ruroni"};
		 String [] Anime = {"naruto","blackclover","onepiece","onepunchman","tokyogale","goku","baruto","demonslayer"};
		 String [] cartoon = {"shinchan","oggy","tomjerry","titans","pokemon","dragan hunter","doraemon"};
		 int[] prime= {3,5,7,11,13,17,19,23,29,31,37,41};
		 int[] rank ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 int[] value = {1002,5673,1004,5467,5678,4533};
		 
		 int [] price=new int[16];
		 int [] calories =new int[24];
		 String[] movies= new String[14];
		 String[] actors=new String[15];
		 String[] carName= new String[16];
		 
		  
		 
		 
		  for (int i=regno.length-1; i>=0;i--) {
			  if(regno[i] %2!=0) {
				  System.out.println(regno[i]);
			  }
			  
			  	  
		  }
		   
		System.out.println("---------even numbers-----");
		 for(int j=0;j<=rank.length-1;j++) {
			 if(rank[j] %2==0) {
				  System.out.println(rank[j]);
			  }
		 }
		 
		 for (int i=0;i<=value.length-1;i=i+2) {
			 System.out.println(value[i]);
		 }
		 
	}

	
}
