package sayli_Vyavhare;

class StudentInfo{
	void studentName(String firstName,String middleName,String lastName){
        System.out.println(firstName +"\n"+  middleName +"\n"+lastName);
	}	

	void studentOtherDetails(String address,String birthDate,int rollNo){
		System.out.println(address + "\n" + birthDate +"\n"+ rollNo);
	}
	
	public static void main (String[] args){
		StudentInfo studentinfo=new StudentInfo();
		studentinfo.studentName("Sayli","Ajay","Vyavhare");
		studentinfo.studentOtherDetails("A-120,Sai Apartment,Wakad,Pune","5th Sep 1999",50);
	}
}