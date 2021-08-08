package mayur;

class StudentInfo{
	
	void studentName(String name, String middlename , String lastname){
		
		System.out.println("Student First Name is :"+name);
		System.out.println("Student Middle Name is :"+middlename);
		System.out.println("Student Last Name is :"+lastname);
    }
	void studentOtherDetails(String birthdate, int rollNumber, String address){
		
		System.out.println("Student Birthdate :"+birthdate);
		System.out.println("Student Roll Number :"+rollNumber);
		System.out.println("Student address is :"+address);
	}

	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Daniel","John","Buttler");
		studentInfo.studentOtherDetails("04 August 2021", 12345, "A201, Sai Apartment, Kharadi, Pune");
	
	}
}






