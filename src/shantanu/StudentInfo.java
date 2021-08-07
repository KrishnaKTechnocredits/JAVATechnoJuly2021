package shantanu;

class StudentInfo{
	String college = "MIT";
	
	void studentName(String firstName, String middleName, String lastName){
		
		System.out.println("Full Name: "+ firstName + " " + middleName + " " + lastName);
	}
	
	void studentOtherDetails(String bDate, String addr, int rno){
		
		System.out.println("Birth Date: " + bDate);
		System.out.println("Address: " + addr);
		System.out.println("College: "+ college);
		System.out.println("Roll No.: " + rno);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo1 = new StudentInfo();
		studentInfo1.studentName("Sachin", "Rajan", "Tamhane");
		studentInfo1.studentOtherDetails("19 January 1992", "A - 202, Palledium, Kothrud, Pune - 411038", 55);
		System.out.println("-----------------------");
		StudentInfo studentInfo2 = new StudentInfo();
		studentInfo2.studentName("Sanjay", "Mahesh", "Nikam");
		studentInfo2.studentOtherDetails("16 October 1991", "Flat No.101, Shubhankar Apartments, Deccan Gymkhana, Pune - 411004", 30);
	}
}