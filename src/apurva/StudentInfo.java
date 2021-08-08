package apurva;

class StudentInfo{
	
	void studentName(String name, String middleName, String lastName){
		System.out.println(name +"\n" +middleName +"\n" +lastName);	
	}
	
	void studentOtherDetails(String birthDate, String address, int rollNo){
		System.out.println(birthDate +"\n" +address +"\n" +rollNo); 
		
	}
	
	public static void main (String[] args){
		StudentInfo student = new StudentInfo();
		student.studentName("Apurva","Anil","Deshmukh");	
		student.studentOtherDetails("25th Jan 1994", "H-19, cross Street", 29);
	}
}