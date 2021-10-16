package pritiNestedComparisionComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	Employee e1= new Employee(12,"Amruta", 1000,5);
	Employee e2= new Employee(14,"Amruta", 1500,5);
	Employee e3= new Employee(16,"Amruta", 1200,5);
	Employee e4= new Employee(13,"Amruta", 1300,5);
	void sortEmployee() {
	ArrayList<Employee> listOfEmployee= new ArrayList<Employee>();
	listOfEmployee.add(e1);
	listOfEmployee.add(e2);
	listOfEmployee.add(e3);
	listOfEmployee.add(e4);
	Collections.sort(listOfEmployee);
	System.out.println("Employee sorting based of name->yearsOFExperience->Salary :");
	System.out.println(listOfEmployee);
	Collections.sort(listOfEmployee, Collections.reverseOrder());
	System.out.println("Reverse Employee sorting based of name->yearsOFExperience->Salary :");
	System.out.println(listOfEmployee);
	
	}
	public static void main(String[] a) {
		Client c1= new Client();
		c1.sortEmployee();
	}
	
}
