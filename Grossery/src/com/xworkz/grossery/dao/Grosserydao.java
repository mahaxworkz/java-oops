package com.xworkz.grossery.dao;

public class Grosserydao {

	String[] grosserylist = new String[20];

	public String[] Createlist(String str) {

		if (str != null && str.length() > 3) {

			for (int i = 0; i < grosserylist.length; i++) {
				if (grosserylist[i] == null) {

					grosserylist[i] = str;
					System.out.println(grosserylist[i]);
					return grosserylist;
				}
			}
		}
		System.out.println("not executing");
		return grosserylist;

	}

	public void readlist() {
		for (int j = 0; j < grosserylist.length; j++) {
			System.out.println(grosserylist[j]);
		}
	}

// updating by index
	public boolean Updatelist(String newthing, int index) {
		if (index >= 0) {
			if (index < grosserylist.length) {
				if (newthing != null) {
					grosserylist[index] = newthing;

				}
				System.out.println("the given value is null");
			} else {
				System.out.println("the given index is beyond the array length");
			}
		} else {
			System.out.println("the given index value is negative");
		}
		return false;
	}

	public boolean UpdateName(String olditem, String Newitem) {
		if (olditem != null) {
			if (Newitem != null) {
				for (int i = 0; i <= grosserylist.length - 1; i++) {
					if (olditem.equals(grosserylist[i])) {
						grosserylist[i] = Newitem;
						return true;
					}
					
				}
				 {
					System.out.println("the given olditem is not  present in array");
				}

			} else {
				System.out.println("the given new item is null");
			}
		}

		else {
			System.out.println("the given old item is null");
		}

		return false;
	}

	// delete using index
	public boolean Deletebyindex(int index1) {
		if (index1 >= 0) {
			if (index1 < grosserylist.length) {

				grosserylist[index1] = null;
				System.out.println("successfully deleted");
				return true;

			} else {
				System.out.println("the given index is beyond the array length");
			}
		} else {
			System.out.println("the given index value is negative");
		}
		return false;

	}

	public boolean Deletebyname(String unwanted_product) {
		
		if(unwanted_product != null) {
			for (int j=0;j< grosserylist.length;j++) {
				if(unwanted_product.equals( grosserylist[j])) {
				grosserylist[j]=null;
				return true;
			}
		}
			 
		
		System.out.println("the product value is null");
		return false;
	}
		return false;
	
	}
	}	
	

