package sagar_Anasane;

class StudentInfo{
	
	void studentName(String name, String middleName ,String surname){
		System.out.println("Student full name is "+name + middleName + surname);
	}
	
	void studentOtherDetails(String birthDate,String address, int Rno){
		System.out.println("Student other Details are " +"\n"+ "Birth Date = "+birthDate +"\n"+ "Address = " + address +"\n"+ "Roll no = " + Rno);
	}	

	public static void main (String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Kunal ","Hardik " ,"Pandya ");
		studentInfo.studentOtherDetails("20_Oct_1994 ","A 401 Shantiniketan Bavdhan_Pune",201);
	}
}	