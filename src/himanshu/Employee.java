package himanshu;

class Employee{
 
   String empFirstNameame = "Himanshu";
   String empLastName = "Gupta";
   int empId = 23;
   
   void displayInfo(){
   
   System.out.println(empFirstNameame+" "+empLastName+" "+empId);
   
   }
   public static void main(String[] args){
	
     Employee e1 = new Employee();
     e1.displayInfo();	 
	   
   }
   
   }
 
 
 