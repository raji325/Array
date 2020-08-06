package com.capgemini.enhancedforloop;

public class TestA {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	for(int x:a) {
		System.out.println("x="+x);
	}
	System.out.println("*****************************************");
	String[] names= {"Rama","Seeta","Bheema"};
	for(String value:names) {
		System.out.println("Names="+value);
	}
	System.out.println("*****************************************");
	double[] b= {12.3,45.6,87.4,98.9};
	for(double val:b) {
		System.out.println("val="+val);
	}
	
}
}
