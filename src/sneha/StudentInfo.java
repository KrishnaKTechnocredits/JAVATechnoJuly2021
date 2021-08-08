package sneha;

class StudentInfo{
	String name = "Shikha";
	String middleName = "Amit";
	String surname = "Patel";
	String birthDate = "10th Aug 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollno = 34;
	
	void studentName(){
		System.out.println(name + " " + middleName + " " + surname );
		System.out.println(birthDate);
	}
	
	void studentOtherDetails(){
		System.out.println(address + "\n" + rollno);
		
	}
	
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}