// Employee has empFirstName, empLastName, empId, it should printable
package poojaJoshi;

class Employee{
	
	String empFirstname="Sheldon";
	String empLastname="Cooper";
	int empId=123;
	
	void companyInfo(){
		
		System.out.println("Employee first name is : " +empFirstname);
		System.out.println("Employee last name is : " +empLastname);
		System.out.println("Employee id is : " +empId);
		}
		
		public static void main(String[] args){
			Employee employee = new Employee();
			employee.companyInfo();
		}	
}		
