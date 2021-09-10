package mratunjay.Assignment_1_To_5;

class Assignment_4{
	
	
	void studentName(String stdName,String stdMiddleName,String stdSurname){
		System.out.println("Student Name is: ");
		System.out.println("First Name: "+stdName);
		System.out.println("Middle Name: "+stdMiddleName);
		System.out.println("Surname: "+stdSurname);
	}
	
	void studentOtherDetails(String birthDate,String stdAddress,int stdRollNumber){
		System.out.println("Student other details are: ");
		System.out.println("Birth Date: "+birthDate);
		System.out.println("Address: "+stdAddress);
		System.out.println("Roll Number : "+stdRollNumber);
	}
	public static void main(String[] args){
		
		Assignment_4 A_4 = new Assignment_4();
		A_4.studentName("Mratunjay","no-middle-name","Sharma");
		A_4.studentOtherDetails("18th-june-1987","address-1",10);
		
		Assignment_4 A_5 = new Assignment_4();
		A_5.studentName("arpit","dhor","verma");
		A_5.studentOtherDetails("20-july-1988","address-2",11);
	}
}
