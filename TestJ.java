package com.capgemini.array;

public class TestJ {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println(10/2);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally executed");	
		}
		System.out.println("main ends");
	}	

}
