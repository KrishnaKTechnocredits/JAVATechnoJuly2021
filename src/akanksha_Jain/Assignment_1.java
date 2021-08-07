package akanksha_Jain;

public class Assignment_1 {
	String sName = "Techno";
	int sRollNo = 1;
	void displayStudentInfo(){
		System.out.println("Student's roll number is " +sRollNo + " and name is " +sName + ".");
	}

	//Employee has empFirstName, empLastName, empId, it should printable
	String empFirstName = "Akansha";
	String empLastName = "Jain";
	int empId = 1;
	void displayEmployeeInfo(){
		System.out.println("Employee's name is " +empFirstName + " " +empLastName + " and employee ID is " +empId + ".");
	}
	
	public static void main(String[] args){
		// Print Hello world to system out
		System.out.println("Hello World!");
		Assignment_1 assignment_1 = new Assignment_1();
		System.out.println(assignment_1);
		assignment_1.displayStudentInfo();
		assignment_1.displayEmployeeInfo();
	}
}

