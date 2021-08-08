class StudentInfo{
	
	void studentName(String name, String middleName, String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);		
	}
	
	void studentOtherDetails(String birthDate, String address, int rno){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rno);		
	}
	
	public static void main(String[] a){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shyam", "Pratap", "Anasane");
		studentInfo.studentOtherDetails("1 Jan 2000", "Deccan Pune", 101);		
	}
}