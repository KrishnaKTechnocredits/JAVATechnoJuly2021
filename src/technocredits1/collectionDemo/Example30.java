package technocredits1.collectionDemo;

import java.util.Collections;
import java.util.TreeSet;

public class Example30 {

	public static void main(String[] args) {
		TreeSet<Employee> employeeSet = new TreeSet<Employee>(Collections.reverseOrder());
		Employee emp1 = new Employee(1,"Maulik",10000);
		Employee emp2 = new Employee(2, "Vivek", 150000);
		Employee emp3 = new Employee(3, "Sagar", 120000);
		Employee emp4 = new Employee(4, "Rasika", 90000);
		
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		
		System.out.println(employeeSet);
	}
}
