// Assignment 4
// StudentInfo Class having 5 varible 
// Two mtds 
package himanshu;

class StudentInfo{
	
	void studentName(String name, String middlename, String lastname){
		System.out.println("Name :"+ name);
		System.out.println("Middle Name :"+ middlename);
		System.out.println("Last Name :"+ lastname);
	}
	
	void studentDetails(String birthdate, String address, int rollno){
		System.out.println("Date Of Birth:"+ birthdate);
		System.out.println("Address:"+ address);
		System.out.println("Roll Number:"+ rollno);
	}
	
	public static void main (String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Mahendra","Singh","Dhoni");
		studentInfo.studentDetails("7July1981","Ranchi",07);
	}
}