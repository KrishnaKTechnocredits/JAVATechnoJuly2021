
//To print student name and rNo
package elizabeth;
class Student{
	
	String stdName="Magdalene Joyce";
	int rNo=44;

	void displayInfo(){
		System.out.println("Student name is "+stdName);
		System.out.println("Student rNo is "+rNo);
}
	public static void main(String[] arg){
		Student s1 = new Student();
		s1.displayInfo();
		
	}
}

//To print Employee fname,lname and empid
class Employee{
	
	String empFirstName="First";
	String empLastName="Last";
	int empId= 4532;
	
	
	void empInfo(){
		System.out.println("Employee first name is "+empFirstName);
		System.out.println("Employee last name is "+empLastName);
		System.out.println("Employee Id is "+empId);
			
	}
	public static void main(String[] arg){
		Employee e1 = new Employee();
		e1.empInfo();
		
	}
	
}