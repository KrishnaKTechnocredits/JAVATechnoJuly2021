package ashit;

class StudentInfo {

	void studentName(String Name,String middle_name, String surname){
		System.out.println("Student First Name is:" +Name);
		System.out.println("Student Middle Name is:" +middle_name);
		System.out.println("Student surname is:" +surname);
	}
	
	void studentOtherDetails(String birthdate,String Address, int Roll_no){
		System.out.println("Birthdate is:" +birthdate);
		System.out.println("Address is:" +Address);
		System.out.println("Roll no. is:" +Roll_no);
	}
	
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Amit","Dev","Shah");
		studentinfo.studentOtherDetails("10th Aug 1965", "Bhuvan House, Ellisbridge, Ahmedabad", 22);
	}

}