package arti_G;

//Assignment4
class Assignment_4 {

	String name;
	String middleName;
	String surName;
	String birthDate;
	String address;
	int rollNumber;

	void studentName(String name, String middleName, String surName) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}

	void studentOtherDetails(String birthDate, String address, int rollNumber) {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args) {
		Assignment_4 assignment_4 = new Assignment_4();
		assignment_4.studentName("Arti", "Saini", "Gahlot");
		assignment_4.studentOtherDetails("23 Oct 1993", "Sector 48, Gurgaon", 784747);
	}
}