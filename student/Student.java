package org.student;

import org.department.Department;

public class Student extends Department  {

	public void studentName() {
		System.out.println("student name geetha");
	}
	public void studentDept() {
		System.out.println("biomedical dept");
	}
	public void studentId() {
		System.out.println("id22355");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
		
	}
 

