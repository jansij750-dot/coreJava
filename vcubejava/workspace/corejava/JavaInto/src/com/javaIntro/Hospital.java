package com.javaIntro;



public class Hospital {
	static String Hospital_Name="Apollo Hospitals";
	Long patient_Id;
	String Patient_Name;
	Long treatment_cost;
	
	void calculationbill() {
		int totalbill=10000+500;
		int tax=500;
		System.out.println("Hospital Name:"+Hospital_Name);
		System.out.println("patientId:"+patient_Id);
		System.out.println("PatientName:"+Patient_Name);
		System.out.println("Treatmentcost:"+treatment_cost);
       System.out.println(totalbill+tax);
	}

	public static void main(String[] args) {
		 
		Hospital h=new Hospital();
	
		
		h.patient_Id=101l;
		h.Patient_Name="JAnsi";
		h.treatment_cost=10000L;
	
		h.calculationbill();
		
		
	}

}
