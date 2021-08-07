package akshay;

class StudentInfo{
	
	void studentName(String name, String middleName, String lastName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(lastName);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNo){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Akshay", "Arun", "Malshetwar");
		studentInfo.studentOtherDetails("7th June 1995", "Ram Nagar, Chikhali", 27);
	}
}