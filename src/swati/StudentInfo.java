package swati;

class StudentInfo{
	
	void studentName(String firstName ,String middleName,String surName){
		System.out.println("First Name is:" + firstName);
		System.out.println("Middle Name is:" + middleName);
		System.out.println("Surname is:" + surName);
	}
	
	void studentOtherDetails(String birthdate,String address, int rollNo){
		System.out.println("Address:" + address);
		System.out.println("BirthDate:" + birthdate);
		System.out.println("RollNumber:" + rollNo);
	}
	
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Shikha","Amit","Patel");
		studentinfo.studentOtherDetails("10th Aug 1998,G-809","Heaven Apartment, Baner, Pune.",34);
		
	}

}
		