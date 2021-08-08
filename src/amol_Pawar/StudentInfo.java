//Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
package amol_Pawar;
class StudentInfo{
	String name;
	
	void studentName(String nameStudent,String middleName, String surname){
		name=nameStudent;
		System.out.println("Full name of student is : "+name+" "+middleName+" "+surname);
	}
	
	void studentOtherDetails(String address,String birthdate,int rollNo){
		System.out.println("Birthdate of "+name+" is : "+birthdate+" and RollNum is : "+rollNo);
		System.out.println("Address of "+name+" is : "+address);	
	}
	
	public static void main(String[] args){
		StudentInfo studentinfo =new StudentInfo();
		studentinfo.studentName("Amol","H","Pawar");
		studentinfo.studentOtherDetails("G-809, Heaven Apartment, Baner, Pune","22 jan 1993",5);
	}	
}