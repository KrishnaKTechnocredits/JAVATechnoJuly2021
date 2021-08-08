package prerana;
class Assignment4{
	
	String name;
	String midName;
	String SurName;
	String birthDate;
	String Address;
	int rno;
	
	
	void studentName(String name,String midName,String SurName){
		System.out.println("First name of student is:" +name);
		System.out.println("Middle name of student is:" +midName);
		System.out.println("Sur name of student is:" +SurName);
		
	}
	void studentOtherDetails(String birthDate,int rno,String address){
		System.out.println("student birth date is:" +birthDate);
		System.out.println("Roll no.of student is:" +rno);
		System.out.println("Address of student is:" +address);
		
	}
	
	public static void main(String[] args){
	Assignment4 a=new Assignment4();
	a.studentName("Prerana","M","Birari");
	a.studentOtherDetails("1st March 1998",1,"Gangapur road Nashik");
	}
}