package laxman;
//Employee has empFirstName,empLastName,empID,it should be printable

  class Employee{
       String empFirstName = "Laxman";
	   String empLastName = "Rao";
	   int empID = 347446;
	   
	   void displayInfo(){
	       System.out.println("Employee name is "+ empFirstName);
		   System.out.println("Last name of the Employee is "+ empLastName);
		   System.out.println("Emp ID is "+ empID);
		   
		}
		
		public static void main(String[]args){
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.displayInfo();
		}
		
  }