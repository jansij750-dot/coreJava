package com.javaIntro;

public class Jansi {
	
	static short jersy_no=18;
	String cricketer_name;
	
	//{
	//jersy_no++;
	//}
	void display() {
		System.out.println("main method started");
		System.out.println(jersy_no++);
		System.out.println(cricketer_name);
	}
	
	
	public static void main(String args[]) {
		Jansi j=new Jansi();
		j.cricketer_name="panth";
		j.display();
		
		
		System.out.println("---------------------------------");
		Jansi j1=new Jansi();
		j1.cricketer_name="rohit sharma";
		j1.display();
		
		System.out.println("---------------------------------");
		Jansi j2=new Jansi();
		j2.cricketer_name="Hardhik pandya";
		j2.display();
		
		
		System.out.println("---------------------------------");
		Jansi j3=new Jansi();
		j3.cricketer_name="Ishan kishan";
		j3.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
