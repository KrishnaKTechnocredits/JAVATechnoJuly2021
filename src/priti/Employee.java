package priti;
//employee has empFirstName empLastName empId and it should be printed
class Employee{
	String empFirstName = "Chandan";
	String empLastName = "Nilange";
	int empId = 25;
	
	void displayInformation (){
		System.out.println ("Employee Name is  "+ empFirstName);
		System.out.println ("Employee Last Name is  " + empLastName);
		System.out.println ("Employee Id is  " + empId);
		}
		public static void main(String[] a) {
			Employee e1 = new Employee();
			e1.displayInformation();
		}

			
		
}	