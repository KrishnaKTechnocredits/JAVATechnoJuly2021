//Assignment No.04 StudentInformation like a First Name,middle and Last Name with Birth date , address & Roll No.
 package santosh;
 class StudentInfo1{
	
	void studentName(String fname,String mname,String lname){
	    System.out.println("Student First Name is :"+fname);
		System.out.println("Student Middle Name is :"+mname);
		System.out.println("Student Last Nmae is :"+lname);
	}
	void studentOtherDetails(String birthdate,String address,int rno){
	    System.out.println("Student Birth Date is :"+birthdate);
		System.out.println("Student Address is  :"+address);
		System.out.println("Student Roll no.is :"+rno);
	}
	public static void main(String [] args){
		StudentInfo1 studentInfo1 = new StudentInfo1();
		studentInfo1.studentName("Santosh","A","Patil");
		studentInfo1.studentOtherDetails("25th jun 1993","H-701 Satpur Shivaji Nagar Nashik",11);
	}
}