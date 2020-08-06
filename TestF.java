package com.capgemini.array;

public class TestF {
	public static void main(String[] args) {

		Student[] student = new Student[4];

		Student s1 = new Student(12, "prathyu", 75.3);
		Student s2 = new Student(13, "solanki", 89.5);
		Student s3 = new Student(14, "bindhu", 80.3);

		student[0] = s1;
		student[1] = s2;
		student[2] = s3;

		for (int i = 0; i < student.length; i++) {
			System.out.println("student data:" + student[i]);
		}

	}
}
