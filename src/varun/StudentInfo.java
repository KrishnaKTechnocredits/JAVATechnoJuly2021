//Assignment-4
package varun;

class StudentInfo {

	void studentName(String name, String middleName, String surName) {
		System.out.println("Student First Name is " + name);
		System.out.println("Student Middle Name is " + middleName);
		System.out.println("Student Last Name is " + surName);
	}

	void studentOtherDetails(String DOB, String address, int rollNo) {
		System.out.println("Student date of birth is " + DOB);
		System.out.println("Student address is " + address);
		System.out.println("Student Roll number is " + rollNo);
	}

	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Sachin", "Ramesh", "Tendulkar");
		studentInfo.studentOtherDetails("22-April-1973",
				"19-A, Perry Cross Rd, Bandra West, Mumbai, Maharashtra 400050", 10);
	}
}