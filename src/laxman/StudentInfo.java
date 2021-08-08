package laxman;

//Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

class StudentInfo{
	String name = "Soumya";
	String middleNameame = "Laxman";
	String surname = "Rao";
	String birthdate = "9th Nov 2014";
	String address = "Shree Swami Samarth Society Sus road";
	int rollNo=52;
	
	void studentName(){
		
			System.out.println(name);
			System.out.println(middleNameame);
			System.out.println(surname);	
	}
	void studentOtherDetails(){
		
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNo);
				
	}
	public static void main(String[]args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
		
	}
}