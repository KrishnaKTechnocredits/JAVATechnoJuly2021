package bharat;
class StudentInfo{
	
	
	void studentName(String studentname, String midldeName, String surName){
		System.out.println(studentname);
		System.out.println(midldeName);
		System.out.println(surName);
	}
	void studentOtherDetails(String birthDate, String address, int rollNumber){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	public static void main(String args[]){
		StudentInfo studentinfo= new StudentInfo();
		studentinfo.studentName("Bharsat","Ramrao","Tanpure");
		studentinfo.studentOtherDetails("7 November 1995", "FT 505 Pune Ngar hyway Pune", 20);
	}
}