package com.capgemini.array;

public class TestD {
	public static void main(String[] args) {
		String[] names= {"divya","prashu","vijji","tanuja","shanthi"};
		printNames(names);
	}
	static void printNames(String[] values) {
		for(int i=0;i<values.length;i++) {
			System.out.println("names:"+values[i]);
		}
	}

}
