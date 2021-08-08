package sameer;

class StudentInfo{
	void studentName(String name, String middleName, String surName){
		System.out.println("My Name is" + name);
		System.out.println ("My Middle Name is" + middleName);
		System.out.println("My Surname is" + surName);
	}
	void studentOtherDetails(String birthDate, String address, int rollNumber){
		System.out.println("My BirthDate is" + birthDate);
		System.out.println("My Address is" + address);
		System.out.println("My Roll Number is" + rollNumber);
	}
	public static void main (String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName (" Sameer", " Balasaheb"," Zalke");
		studentinfo.studentOtherDetails (" 19 Dec 1987"," A-501 Aishwarya Residency",1900);
	}
}
	