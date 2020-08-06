package com.capgemini.array;

public class TestH {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30 };

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		/*
		 * Accessing index which is not present you will get
		 * ArrayIndexOutOfBoundException System.out.println(nums[4]);
		 */

		String s = null;
		/*
		 * if you try to invoke some properties or methods on null you will get
		 * NullPointerException. System.out.println(s.length())
		 */;
		if (s != null) {
			System.out.println(s.length());

		}
	}
}
