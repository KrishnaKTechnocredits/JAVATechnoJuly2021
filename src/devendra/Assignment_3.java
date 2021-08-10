package devendra;
/*StudentInfo*/
class Assignment_3{
	void studentName(){
		System.out.println("Devendra");
		System.out.println("Devidas");
		System.out.println("Chandankhede");
	}
	
	void studentOtherDetails(){
		String birthdate = "11th Sept 1995";
		String address = "05, Shivneri Society, Arni Road, Yavatmal-445001";
		int rno = 369;
		System.out.println("My Date of Birth is "+birthdate);
		System.out.println("Address is "+address);
		System.out.println("Roll No. is "+rno);
	}
	public static void main(String[] args){
		
		Assignment_3 studentinfo = new Assignment_3();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}


/*class StudentInfo{
	**int rno;
	String birthdate, address;***
	void studentName(String fname, String mname, String lname){
		System.out.println("First Name is "+fname);
		System.out.println("Middle Name is "+mname);
		System.out.println("Last Name is "+lname);
	}
	
	void studentOtherDetails(String birthdate,String address,int rno){
		**String birthdate = "11th Sept 1995";
		String address = "05, Shivneri Society, Arni Road, Yavatmal-445001";
		int rno = 369;***
		System.out.println("My Date of Birth is "+birthdate);
		System.out.println("Address is "+address);
		System.out.println("Roll No. is "+rno);
	}
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Devendra","Devidas","Chandankhede");
		studentinfo.studentOtherDetails("11th Sept 1995","05, Shivneri Society, Arni Road, Yavatmal-445001",369);
	}
}*/