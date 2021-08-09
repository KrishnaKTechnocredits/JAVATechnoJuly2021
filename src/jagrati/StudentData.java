package jagrati;

public class StudentData{	
	void studentName(String StdName ,String middleName, String surName){
		System.out.println("Student name is "+StdName);
		System.out.println("Student middle name is "+middleName);
		System.out.println("Student middle name is "+surName);
	}
	void studentOtherDetails(String birthDay, String address, int rno){
		System.out.println("Student birthDay date is "+birthDay);
		System.out.println("Student address is "+address);
		System.out.println("Student rollnumber is "+rno);
	}
	public static void main(String []aa){
		StudentData sd = new StudentData();
		sd.studentName("Shikha","Amit","Patel");
		sd.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner Pune", 34);	
	}


}