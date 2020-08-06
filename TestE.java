package com.capgemini.array;

public class TestE {
	public static void main(String[] args) {
	String[] freedomFighters=getNames();
	for(int i=0;i<freedomFighters.length;i++) {
		System.out.println("Names:"+freedomFighters[i]);
	}
	
	
	}
	static String[] getNames() {
		String[] names= {"Bhagat singh","Jhansi Rani","Subhash","sye raa"};
		return names;
	}
}
