// Assignment 4- Print all details of student like Name, Middle Name, Surname,Birthdate, Address androll no
package shalaka.assignment1to5;
class StudentInfo{
	
	void studentName (String name, String middleName, String surName){
		System.out.println("Student First Name is : " +name);
		System.out.println("Student Middle Name is : " +middleName);
		System.out.println("Student Surname is : " +surName);
	}
	
	void studentOtherDetails(String birthday, String address,int rollNo){
		System.out.println("Student Birthdate is : " +birthday);
		System.out.println("Studen Address is : " +address);
		System.out.println("Student Roll No is : " +rollNo);
		
	}
	
	public static void main(String [] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shalaka","Mayur","Prayag");
		studentInfo.studentOtherDetails("15th Sept 1992","Shivneri Society, Plot 5/B,Talegaon Dabhade",48);
		
	}
}



