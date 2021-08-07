//ASSIGNMENT 4: DATE: 04-08-2021
package harshada;
class StudentInfo{
	String name="Charlie";
	String middlename="C.";
	String surname="Harper";
	String dob="15-September-1995";
	String address="Texas,U.S";
	int rollno=31;
	
	void studentName(){
	
		System.out.println("Name of the student is: " + name);
		System.out.println("Middle Name of the student is: " + middlename);
		System.out.println("Last Name of the student is: " + surname);
	}
	void studentOtherDetails(){
	
		System.out.println("DOB of the student is: " + dob);
		System.out.println("Address Name of the student is: " + address);
		System.out.println("rollno of the student is: " + rollno);
	}
	public static void main(String[] s){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}