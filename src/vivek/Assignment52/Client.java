package vivek.Assignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "vivek", 1, 1000);
		Employee emp2 = new Employee(102, "vivek", 2, 5000);
		Employee emp3 = new Employee(103, "vivek", 3, 5000);
		Employee emp4 = new Employee(104, "vivek", 2, 4000);
		Employee emp5 = new Employee(104, "patil", 4, 5000);

		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		listOfEmployees.add(emp5);
		Collections.sort(listOfEmployees);
		System.out.println(listOfEmployees);
	}
}
