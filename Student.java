package org.student;

import org.department.Department;

public class Student extends Department {
	public static void main(String args[]) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}

	public void studentName() {
		System.out.println("Student name: Arumugam S");
	}

	public void studentDept() {
		System.out.println("Student Department: Electronics & Telecommunication Engineering");
	}

	public void studentId() {
		System.out.println("Student ID: ST-38");
	}
}
