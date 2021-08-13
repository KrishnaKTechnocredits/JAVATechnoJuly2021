package trupti;

class Studentinfo1 {

	void studentName(String stdName, String stdMiddleName, String stdSurname) {
		System.out.println(stdName);
		System.out.println(stdMiddleName);
		System.out.println(stdSurname);
	}

	void studentOtherDetail(String birthDate, String address, int rollnumber) {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollnumber);
	}

	public static void main(String[] args) {
		Studentinfo1 studentinfo1 = new Studentinfo1();
		studentinfo1.studentName("Trupti", "Mandar", "Lokhnade");
		studentinfo1.studentOtherDetail("20th Jan 1990", "D-block Lodhi road New Delhi", 23);
	}

}