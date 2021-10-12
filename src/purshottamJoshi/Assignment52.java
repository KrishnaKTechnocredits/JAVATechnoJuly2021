package purshottamJoshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment52 {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Pravin", 10000, 3);
		Employee emp2 = new Employee(2, "Sumit", 12000, 2);
		Employee emp3 = new Employee(3, "Prasad", 14000, 6);
		Employee emp4 = new Employee(4, "Suraj", 15000, 5);
		Employee emp5 = new Employee(5, "Sumit", 12000, 2);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		Collections.sort(employeeList);
		System.out.println(employeeList);
	}

}
