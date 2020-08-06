package com.capgemini.array;

public class VarArgs {
	public static void main(String[] args) {

		add(10, 20);
		add(10, 20, 30);
		getString("xyz", "abc", "pqr");
		getString("xyz", "abc");

	}

	static void add(int... nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println("Total Sum=" + sum);
	}

	static void getString(String... names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println("Names:" + names[i]);
		}
	}
}
