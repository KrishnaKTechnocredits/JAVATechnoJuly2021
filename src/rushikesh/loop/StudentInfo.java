package rushikesh.loop;

class StudentInfo{
	
	void studentName(String studentFirstName,String studentMiddleName,String studentLastName){
		System.out.println("Student's First name is "+studentFirstName);
		System.out.println("Student's Middle name is "+studentMiddleName);
		System.out.println("Student's Last name is "+studentLastName);
	}
	void studentOtherDetails(String birthDate, String address, int rollNumber){
		System.out.println("Student's Birthdate is "+birthDate);
		System.out.println("Student's Address is "+address);
		System.out.println("Student's Roll no is "+rollNumber);
	}
	public static void main(String[] args){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName("Rushikesh","Mangesh","Junewal");
		studentInfo.studentOtherDetails("30th Oct 1999","Samra Nagar,Amravati",21);
	}
}