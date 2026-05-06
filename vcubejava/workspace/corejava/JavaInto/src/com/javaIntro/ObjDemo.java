package com.javaIntro;

public class ObjDemo {
	
	String name="Bhavani";
	int age=24;

	public static void main(String[] args) {
		
		
		//here we need to create the objects to acces the instance variables in the method area
		ObjDemo b=new ObjDemo();
		System.out.println("Enter the Name:"+b.name);
		System.out.println("Age of the person:"+b.age);
		
		
		
		
		//when we are printing the instance variables the we need to access it from by 
//Why do we use object.variable (like obj.name)?
		//Because instance variables belong to an object, not the class.
	//name is an instance variable
	//	It does NOT exist on its own
		//It exists inside each object
		//So how do you access it?

			//	You must first create an object:
	//Why can’t we just write name?

//Because Java needs to know:

//Which object's name are you talking about?
	//static belongs to the class
		//Only one copy exists
	//We use object.variable because:
	//	👉 Instance variables are stored inside objects
	//	👉 Java needs the object reference to know which value to access
	
	//
	}

}
