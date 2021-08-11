//Employee has empFirstName,empLastName,empId, it should be printable
package madhavi;
class Employee{
	
   String empFirstName="Madhavi";
   String empLastName="Churmurkar";
   int empId=11;

   void displayInfo(){
	  System.out.println("Employee First name is " + empFirstName);
	  System.out.println("Employee Last name is " + empLastName);
	  System.out.println("Employee empId is " + empId);
	
    }
	
	public static void main(String[] args){
		Employee emp= new Employee();
		emp.displayInfo();
	}

}