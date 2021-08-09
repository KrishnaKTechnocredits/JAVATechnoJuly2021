// Display student info

package sourabh;

class StudentInfo{

	void studentName(String firstName, String middleName, String lastName){
	System.out.println("Student First Name = " + firstName);
	System.out.println("Student Middle Name = " + middleName);
	System.out.println("Student Last Name = " + lastName);
	}
	
	void studentOtherDetails(String birthDate, String address, int rollNo){
	System.out.println("Student Date of Birth = " + birthDate);
	System.out.println("Student Address = " + address);
	System.out.println("Student Roll No. = " + rollNo);
	}
	
	public static void main(String[] args){
	StudentInfo studentinfo = new StudentInfo();
	studentinfo.studentName("Shikha", "Amit", "Patel");
	studentinfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.", 34);
	}
}