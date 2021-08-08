package shweta_Dharmadhikari;
class StudentInfo{
	String name = "Shweta";
	String middleName = "Sham";
	String surname = "Dharmadhikari";
	String birtday = "1oth Jun 1998";
	String address = "303,Shree Apartment, Dhanori, Pune";
	int rollNumber = 1;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birtday);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}