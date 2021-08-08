package suruchi;

// Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

class StudentInfo{
	
	void studentName(String name, String middleName, String surname){
		System.out.println("Student name is: ");
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNumber){
		System.out.println("Additional Details of student: ");
		System.out.println("Birthdate: " + birthdate);
		System.out.println("Address: " + address);
		System.out.println("Roll number: " + rollNumber);
	}
	
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Sarthak", "Shailesh", "Rathod");
		studentinfo.studentOtherDetails("9th Sept 1995", "Flat 3, Tower B, Powai, Mumbai", 36);
	}

}