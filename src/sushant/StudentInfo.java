package sushant;

class StudentInfo{
	String name = "Sushant";
	String middleName = "Bhausaheb";
	String surname = "Sonawane";
	String birthdate = "3rd June 1989";
	String address = "Pimple Saudagar";
	int rollno = 18;
	
    void studentName(){
		System.out.println("Name of the student is: "+name);
		System.out.println("Middle name of the student is: "+middleName);
	    System.out.println("Surname of the student is: "+surname);
	}
	
	void studentOtherDetails(){
		System.out.println("DOB of the student is: "+birthdate);
		System.out.println("Address of the student is: "+address);
		System.out.println("Rollno of the student is: "+rollno);	
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
    }		
}