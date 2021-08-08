// Assignment 4
package indu;


class StudentInfo
{
	void studentName(String firstName,String midName ,String lastName)
	{
			System.out.println("Name : "+ firstName +" " + midName + " " + lastName);
	}
	
	void studentOtherDetails(int rno ,String birthdate ,String address)
	{
		System.out.println("Roll no : " + rno);
		System.out.println("Birthdate : " + birthdate);
		System.out.println("Address : " + address);
	}
	
	public static void main(String[] args)
	{
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Kiya","Raj","Agrawal");
		studentInfo.studentOtherDetails(11,"7 July 2005", "Wakad ,Pune 411057");
		System.out.println("===========================================");
		studentInfo.studentName("Vihan","Nikhil","Deshmukh");
		studentInfo.studentOtherDetails(90,"9 Nov 2005", " Baner, Pune 445001");
		
	}
}