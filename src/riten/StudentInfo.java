package riten;

class StudentInfo{
	
	void studentName(String Name, String Middle_Name, String Surname){
		System.out.println("Student primary details");
		System.out.println(Name+'\n'+Middle_Name+'\n'+Surname);
	
	}
	
	void studentOtherDetails(String birthdate, String Address, int Roll_number){
		System.out.println("Student other details");
		System.out.println(birthdate+'\n'+Address+'\n'+Roll_number);
		
	}
	public static void main (String[] arg){
	StudentInfo studentInfo =new StudentInfo();
	studentInfo.studentName("Riten","Jagdish","Thakkar");
	studentInfo.studentOtherDetails("1st Jan 1998","D-106, Mahindra Royal",91);
	}

}	

//assignment4