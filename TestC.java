package com.capgemini.array;

public class TestC {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 50, 40 };
		printArrayData(nums);
		int[] arrayData = getArray();
		for (int i = 0; i < arrayData.length; i++) {
			System.out.println("Array value:" + arrayData[i]);
		}
	}

	static void printArrayData(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("value:" + numbers[i]);
		}
	}

	static int[] getArray() {
		int[] myArray = { 70, 60, 80, 100 };
		return myArray;

	}

}
