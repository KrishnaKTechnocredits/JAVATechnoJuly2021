package ritabrata;
class StudentInfo{
	void studentName(String name, String middleName, String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String rollNo, String birthdate, String address){
		System.out.println(rollNo);
		System.out.println(birthdate);
		System.out.println(address);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Sandip", "Kumar", "Paul");
		studentInfo.studentOtherDetails("S3501", "20 Dec 2001", "Golapbag, Burdwan, PIN: 713104, WB, India");
	}
}