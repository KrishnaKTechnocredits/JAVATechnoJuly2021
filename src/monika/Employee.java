package monika;
class Employee{
	String empFName="Monika";
	String empLName="Zankar";
	int empId=1;
	
	void displayInfo(){
		
		System.out.println("Employee FirstName is: "+empFName);
		System.out.println("Employee LastName is: "+empLName);
		System.out.println("Employee Id is: "+empId);
	}
	public static void main(String[] a)
	{
		Employee e1=new Employee();
		e1.displayInfo();
	}
}
