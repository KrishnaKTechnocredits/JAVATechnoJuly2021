package chandani;

class StudentInfo{

	void studentName(String Name, String middlename, String surname){
		System.out.println("\n First Name: " + Name + " \n Middle Name: " + middlename + " \n Last Name: "+ surname);
	}
	
	void studentOtherDetails(String birthdate, String Address, int rollNumber){
		System.out.println("\n Birth Date: " + birthdate + "\n Address: " + Address + "\n Roll Number: " + rollNumber );
	}
	
	public static void main (String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Chandni","KishanKumar","Fatehchandani");
		studentinfo.studentOtherDetails("06th April 1989","Club House, Peddar Road, Mumbai", 394146);
	}
}