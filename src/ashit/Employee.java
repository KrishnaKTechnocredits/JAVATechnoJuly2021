//Employee has empFirstName, empLastName, empId, it should printable
package ashit;

class Employee{
	String empFirstName="Ashit";
	String empLastName="Samdur";
	int empId=001;
	
	void displayInfo(){
		System.out.println(empFirstName);
		System.out.println(empLastName);
		System.out.println(empId);
	}
	public static void main(String[] a){
			Employee e1=new Employee();
			e1.displayInfo();
	
	}	
}
 