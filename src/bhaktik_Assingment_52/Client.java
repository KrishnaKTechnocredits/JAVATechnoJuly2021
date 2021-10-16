package bhaktik_Assingment_52;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	
	public static void main(String[] args) {
		
		Employee emp1= new Employee(100,"Bhakti",130000,4);
		Employee emp2= new Employee(2,"Bhakti",12000,5);
		Employee emp3= new Employee(45,"Amruta",3000,6);
		Employee emp4= new Employee(50,"Harsada",40000,14);
		Employee emp5= new Employee(9,"Amol",1100,6);
		
		ArrayList<Employee> employeeList= new ArrayList();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		
		Collections.sort(employeeList);
		System.out.println(employeeList);
	}
	
	
	
 
	

}
