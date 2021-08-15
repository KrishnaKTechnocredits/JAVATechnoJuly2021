/*  Assignment - 4 : 4th Aug'2021

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

package arti_K.Assignment_1_5;

class StudentInfo1{
		
	void studentName(String fname , String midname , String lname){
		System.out.println("First name of Student : "+fname);
		System.out.println("Middle name of Student : "+midname);
		System.out.println("Last name of Student : "+lname);
	}
	
	void studentOtherDetails(String add , String bdate , int rno){
		System.out.println("Address of Student : "+add);
		System.out.println("Birthdate of Student : "+bdate);
		System.out.println("Roll No of Student : "+rno);
	}
	
	public static void main(String[] args){
		StudentInfo1 studentinfo1 = new StudentInfo1();
		studentinfo1.studentName("Shikha","Amit","Patel");
		studentinfo1.studentOtherDetails("G-809, Heaven Apartment, Baner, Pune.","10th Aug 1998",34);
	}
}