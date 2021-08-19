package margi;

class Assignment_4_StudentInfo{
	
	int rno = 34;
	String name = "Shikha";
	String middleName = "Amit";
	String surname = "Patel";
	String birthdate = "10th August 1998";
	String address = "Pune";
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Assignment_4_StudentInfo studentInfo = new Assignment_4_StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}