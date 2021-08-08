package kalpesh;

class StudentInfo{

    String firstName= "Kalpesh";
	String middleName= "Satish";
	String surname= "Chaudhari";
	String birthDate= "1st Oct 1992";
	String address= "G-809 Heaven Appartment,Kothrud, Pune.";
	int rollNumber= 10;
	
	void studentName(){
		
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(surname);
	}
	void studentOtherDetails(){
		
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		
		StudentInfo sudentinfo = new StudentInfo();
		sudentinfo.studentName();
		sudentinfo.studentOtherDetails();
		
	}
}