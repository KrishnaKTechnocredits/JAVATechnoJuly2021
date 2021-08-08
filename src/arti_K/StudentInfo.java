/*  Assignment - 4 : Day 4 4th Aug'2021

Program 1: 
Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998) as String, Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. In main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

Sample Output :
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34  */

package arti_K;

class StudentInfo{
	String fName;
	String middleName;
	String lastName;
	String address;
	String birthdate;
	int rollNo;
	
	void studentName(String fname , String midname , String lname){
		fName = fname;
		middleName = midname;
		lastName = lname;
		System.out.println("First name of Student : "+fName);
		System.out.println("Middle name of Student : "+middleName);
		System.out.println("Last name of Student : "+lastName);
	}
	
	void studentOtherDetails(String add , String bdate , int rno){
		address = add;
		birthdate = bdate;
		rollNo = rno;
		System.out.println("Address of Student : "+address);
		System.out.println("Birthdate of Student : "+birthdate);
		System.out.println("Roll No of Student : "+rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Shikha","Amit","Patel");
		studentinfo.studentOtherDetails("G-809, Heaven Apartment, Baner, Pune.","10th Aug 1998",34);
	}
}