package rasika;

class StudentInfo{
	String name = "Rasika";
	String middleName = "Nitin";
	String surname = "Mahadik";
	String birthDate = "24 Feb 1997";
	String address = "Mahad Raigad";
	int rollNumber = 10;
	
	void studentName(){
		
		System.out.println("Name is " + name);
		System.out.println("Middle name is " + middleName);
		System.out.println("Surname is " + surname);
	}
	
	void studentOtherDetails(){
		System.out.println("Birthdate is " + birthDate);
		System.out.println("Address is " + address);
		System.out.println("Roll No is " + rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}