package sagar_Gharge;


class StudentInfo{

	String firstName = "Sagar";
	String middleName = "Ramesh";
	String lastName = "Gharge";
	String dateofBirth = "7 March 1995";
	String address = "311, Kashish Park , Thane";
	int studentRollno = 7;
	
	void studentName(){
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);	
	}
	
	void studentotherDetails(){
		System.out.println(dateofBirth);
		System.out.println(address);
		System.out.println(studentRollno);
	}
	
	public static void main(String []args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentotherDetails();
	}
	
}
	
	