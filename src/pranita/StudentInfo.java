//Assignment 4
package pranita;

class StudentInfo{
	
	void studentName(String firstName ,String middleName ,String lastName){
		System.out.println("Student first name is :"+firstName);
		System.out.println("Student middle name is :"+middleName);
		System.out.println("Student last name is :"+lastName);
		
	}
	
	void studentOtherDetails(String birthdate ,String address ,int rno ){
		System.out.println("Student birthdate is :"+birthdate);
		System.out.println("Student address is :"+address);
		System.out.println("Student roll no is :"+rno);
	
    }	
	
	public static void main(String[] a){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName("Anjali","P","waghmare");
		studentInfo.studentOtherDetails("24 april 1994","604,Amarante,kalamboli,Navi mumbai 410218",25);
		
	}	
	
}