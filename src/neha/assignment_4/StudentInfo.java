//Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number
//assignment 4, 4th August 2021
package neha.assignment_4;
class StudentInfo{
	//studentName() method should print details like Name, middle name, surname
	void studentName(String stdName,String stdMiddleName,String stdSurname){
		System.out.println("\r\nStudent Name is: ");
		System.out.println("First Name: "+stdName);
		System.out.println("Middle Name: "+stdMiddleName);
		System.out.println("Surname: "+stdSurname);
	}
	//studentOtherDetails() method print details like birthdate, Address, and Roll number
	void studentOtherDetails(String birthDate,String stdAddress,int stdRollNumber){
		System.out.println("\r\nStudent other details are: ");
		System.out.println("Birth Date: "+birthDate);
		System.out.println("Address: "+stdAddress);
		System.out.println("Roll Number: "+stdRollNumber);
	}
	public static void main(String[] args){
		//student 1
		StudentInfo studentInfo1=new StudentInfo();
		studentInfo1.studentName("Parth","Abhijeet","Joshi");
		studentInfo1.studentOtherDetails("17th Aug 2017","H-1201 Silver Gardenia",12);
		//student 2
		StudentInfo studentInfo2=new StudentInfo();
		studentInfo2.studentName("Sara","Praveen","Deshpande");
		studentInfo2.studentOtherDetails("23rd Nov 2009","D-904 Rahul Park",18);
	}
}