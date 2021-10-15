package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Example31 {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,"Maulik",10000);
		Employee emp2 = new Employee(2, "Vivek", 150000);
		Employee emp3 = new Employee(3, "Sagar", 120000);
		Employee emp4 = new Employee(14, "Rasika", 9000);
		Employee emp5 = new Employee(5, "Rasika", 9000);
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		
		Collections.sort(employeeList, Collections.reverseOrder());
		System.out.println(employeeList);
	}
}
