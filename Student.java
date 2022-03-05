package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department  {
	
	public void studentName() {
		System.out.println("Enter student name");
	}
	public void studentDept() {
		System.out.println("Enter student Dept");
	}
	public void studentId() {
		System.out.println("Enter student Id");
	}
	
	public static void main(String[] args) {
		
		College college=new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		Department dept=new Department();
		dept.deptName();
		
		Student std=new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
	}
	}
