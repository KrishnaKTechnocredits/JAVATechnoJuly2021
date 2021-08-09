package chirag;

//Assignment4

class StudentInfo{
	String name;
	String middleName;
	String surname;
	String birthDate;
	String address;
	int rollNo;
	
	void studentName(String Name,String MiddleName,String Surname){
		name=Name;
		middleName=MiddleName;
		surname=Surname;
		System.out.println(Name);
		System.out.println(MiddleName);
		System.out.println(Surname);
	}
	void studentOtherDetails(String DateOfBirth,String Address,int RollNo){
		birthDate=DateOfBirth;
		address=Address;
		rollNo=RollNo;
		System.out.println("Date of Birth:"+DateOfBirth);
		System.out.println("Address:"+Address);
		System.out.println("RollNo:"+RollNo);
	}
	public static void main(String[]args){
		StudentInfo student_info1=new StudentInfo();
		student_info1.studentName("Chirag","Kumar","Prajapati");
		student_info1.studentOtherDetails("05 june 1994","Ujjain",777);
	}
}