package com.xworkz.families.data;

 
public class FamilyData {
	public String familyname;
	public int familymembers;
	public boolean isjointfamily;
	public long  familyproperties;
	public String familyhead;
	
	public FamilyData(String familyname, int familymembers, boolean isjointfamily,long familyproperties,String familyhead) {
		this.familyhead=familyhead;
		this.familymembers=familymembers;
		this.familyname=familyname;
		this.familyproperties=familyproperties;
		this.isjointfamily=isjointfamily;
	}

	
	public String toString() {
		return "Familyname is :"+familyname   +" NO of FamilyMembers: "+ familymembers   +  "is the family joinfamily :"  +isjointfamily +  "Head of family is "+ familyhead  +  "properties owned by family="+ familyproperties  ;
		
	}
	
public boolean equals(FamilyData  anime) {
		
		if( this.familyname.equals(familyname)  && this. familyproperties ==anime. familyproperties && this.isjointfamily== anime.isjointfamily) {
			
			return true;	
		}
		else {
			return false;
		}
	
}
}
