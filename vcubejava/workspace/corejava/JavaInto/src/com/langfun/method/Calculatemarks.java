package com.langfun.method;

import java.util.Scanner;
//write a java program using methods to accept marks of 3 subjects,calculate total and average marks and display student details
public class Calculatemarks {
	
	
	static void display(int m1,int m2,int m3) {
	System.out.println("enter your subject marks:"+m1);	
	System.out.println("enter your subject marks:"+m2);	
	System.out.println("enter your subject marks:"+m3);	
	}
    static void total(int m1,int m2,int m3) {
    int f1=m1+m2+m3;
    System.out.println("enter your total marks:"+f1);
	}
    static void averagemarks(int m1,int m2,int m3) {
    double f2=(m1+m2+m3)/3;
	System.out.println("enter your average marks:"+f2);	
	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); {
    System.out.println("enter your math marks:");
    int n1=sc.nextInt();
    System.out.println("enter your science marks:");
    int n2=sc.nextInt();
    System.out.println("enter your social  marks:");
    int n3=sc.nextInt();
    display(n1,n2,n3);
    total(n1, n2, n3);
    averagemarks(n1, n2, n3);
    
    }

	}

}
