package deepakkankhar;
class StudentInfo{
		
	void studentName(String fName,String mName, String sName){
		System.out.println("First Name: "+fName);
		System.out.println("Middle Name: "+mName);
		System.out.println("SurName: "+sName);
	}
	
	void studentOtherDetails(String birthDate, String address, int rollNo){
		System.out.println("Date of Birth: "+birthDate);
		System.out.println("Address: "+address);
		System.out.println("Roll Number: "+rollNo);
	}
	
	public static void main(String[] a){
		StudentInfo student=new StudentInfo();
		student.studentName("Shikha","Amit","Patel");
		student.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner, Pune.",34);
	}
}