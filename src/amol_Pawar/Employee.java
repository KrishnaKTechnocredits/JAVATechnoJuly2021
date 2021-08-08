package amol_Pawar;
class Employee
{
	String empFirstName="Amol";
	String empLastName="Pawar";
	int empId=1;

	void displayInfo()
	{	
		System.out.println("Employee FirstName : "+empFirstName);
		System.out.println("Employee LastName : "+empLastName);
		System.out.println("Employee ID : "+empId);

	}
	
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.displayInfo();
	}
}