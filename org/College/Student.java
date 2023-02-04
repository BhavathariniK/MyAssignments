package org.College;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Bhavatharini");
	}

	public void studentDept()
	{
		System.out.println("IT");
	}
	
	public void studentID()
	{
		System.out.println("920852206");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student b = new Student();
     b.collegeName();
     b.collegeCode();
     b.collegeRank();
     b.deptName();
     b.studentName();
     b.studentDept();
     b.studentID();
	}

}
