/*
 Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
 */
package umakant.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment52 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Umakant", 3, 900);
		Employee emp2 = new Employee(2, "Umakant", 3, 200);
		Employee emp3 = new Employee(3, "Umakant", 6, 400);
		Employee emp4 = new Employee(4, "Kartik", 2, 400);
		Employee emp5 = new Employee(5, "Kunal", 2, 403);
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
