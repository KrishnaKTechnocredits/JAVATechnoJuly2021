package shweta_Bhosale;
class StudentInfo{
	String name= "Shikha";
	String middleName = "Amit";
	String surname = "Patel";
	String birthDate = "10th Aug 1998";
	String Address = "G-809, Heaven Apartment, Baner, Pune";
	int rollNumb= 03;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(Address);
		System.out.println(rollNumb);
	}
	
	public static void main(String[] a){
		StudentInfo studentInfo= new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}