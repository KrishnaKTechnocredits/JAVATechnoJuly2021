// Employee has empFirstName, empLastName, empId, it should printable
package bhakti;

class Employee{
	
	String empFirstName = "Bhakti";
	String empLastName = "Kakade";
	int empID = 1;
	
	void employeeDisplay(){
		System.out.println ("Name of employee" +empFirstName +" " +empLastName+ " and employee ID" + empID );
		System.out.println (empFirstName);
		System.out.println (empLastName);
		System.out.println (empID);
		
	}
	
	
	
	public static void main(String[] a){
		 Employee s1= new Employee();
		 s1.employeeDisplay();
		 
		 
		 
	}
	
}