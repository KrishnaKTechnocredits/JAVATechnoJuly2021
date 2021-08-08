package madhavi;
class StudentInfo{
	void studentName(String fName,String midName,String lastName){
		System.out.println("Student Details: "+"\n"+"FirstName: "+ fName+ "\n" +"MiddleName: "+ midName+ "\n"+"LastName: " + lastName);
	}
	
	void studentOtherDetails(String birth,String address,int rollno){
		System.out.println("Student Other Details: "+"\n"+"Birthdate: " +birth+ "\n" +"Address: "+address+ "\n"+"Rollno: " +rollno);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo= new StudentInfo();
		studentInfo.studentName("Ilia","Serg","Ash");
	    System.out.println("***************************************************************************");
		studentInfo.studentOtherDetails("14th Dec 1994","F-404,Ivory Apartment,Aundh,Pune.",25);
	}
}	