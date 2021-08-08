// Employee Example
package indu;

class Employee
{
	String empFirstName ="Indu";
	String empLastName ="Bhartiya";
	int empId = 11;
	
	void displayEmpDetails()
	{
		System.out.println("Employee first name is :" + empFirstName);
		System.out.println("Employee last name is :" + empLastName);
		System.out.println("Employee id is :" + empId);
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.displayEmpDetails();
		
	}
}