package com.langfun.method;



public class CarDetails {
	String Carname;
    String color;	
    String BrandName;
    String model;
	
	 void CarNameDetails(String Carname,String color,String Brandname,String model) {
		System.out.println(Carname);
		System.out.println(color);
		System.out.println(Brandname);
		System.out.println(model);
		
	}

	public static void main(String[] args) {
		CarDetails c1=new CarDetails();
		c1.CarNameDetails("suzuki", "blue", "suzuki","xyz");
	    

	}

}
