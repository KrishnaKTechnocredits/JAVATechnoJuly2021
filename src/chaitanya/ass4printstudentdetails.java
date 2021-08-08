//Assignment - 4 : 4th Aug'2021

//Program 1: 
//Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

//1. Create class called StudentInfo
//2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998) as String, Address as String and rollNumber as int.
//3. Create two methods called studentName() and studentOtherDetails()
//4. studentName() method should print details like Name, middle name, surname.
//5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
//6. Create main method.
//7. In main method.
//	a. Create object of StudentInfo class.
//	b. call studentName() and studentOtherDetails() method on reference variable
//8. Compile & Run

//Sample Output :
//Shikha
//Amit
//Patel
//10th Aug 1998
//G-809, Heaven Apartment, Baner, Pune.
//34
package chaitanya;
class Ass4studentinfo{
	
	    String name = "Chaitanya";
		String middlename = "Chaitu" ;
		String surname = "Damarapakam";
		String birthdate = "2nd Jul 1994";
		String address = "G-809, Heaven Apartment, Baner, Pune";
		int rno = 31;
	
	void studentName(){
		System.out.println("Name :" + name + "\n" + "Middle Name :" + middlename + "\n" + "Surname :" + surname + "\n" );
	}
	
	void studentOtherDetails(){
		System.out.println("Date of Birth :" + birthdate + "\n" + "Address :" + address + "\n" + "Roll No. :" + rno);
	}
	
	public static void main (String[] args){
		Ass4studentinfo ass4studentinfo = new Ass4studentinfo();
		ass4studentinfo.studentName();
		ass4studentinfo.studentOtherDetails();
	}
}	