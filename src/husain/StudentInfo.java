package husain;

class StudentInfo {

	void studentName(String fName, String mName, String lName) {

		System.out.println(fName);
		System.out.println(mName);
		System.out.println(lName);

	}

	void studentOtherDetails(String dob, String address, int rNo) {

		System.out.println(dob);
		System.out.println(address);
		System.out.println(rNo);
	}

	public static void main(String[] args) {

		StudentInfo info = new StudentInfo();
		info.studentName("Andy", "James", "Samberg");
		info.studentOtherDetails("21st August 1988", "Apt 2, 303 Oakmont dr, Pittsburgh, PA, 15220", 12);
	}
}