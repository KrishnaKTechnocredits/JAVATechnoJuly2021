// Employee has empFirstName, empLastName, empId it should printable

package sourabh;

class Employee{
	String empFirstName = "FirstName";
	String empLastName = "LastName";
	int empId =104;
	
	void displayInfo(){
	System.out.println("Employee FirstName = "+ empFirstName);
	System.out.println("Employee LastName = "+ empLastName);
	System.out.println("Employee ID = "+ empId);
	//System.out.println("empFirstName = "+ empFirstName and "empLastName = "+ empLastName and "empId = "+ empId);
	
	}
	
	public static void main(String[] a){
		Employee e1 = new Employee();
		e1.displayInfo();
	}
}