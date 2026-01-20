/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.*/

package astha.Assignment52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, 3000, 2, "Chris");
		Employee emp2 = new Employee(3, 4700, 1, "Roma");
		Employee emp3 = new Employee(5, 7000, 5, "Raphael");
		Employee emp4 = new Employee(2, 5500, 4, "John");
		Employee emp5 = new Employee(4, 3300, 3, "Marko");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		Collections.sort(list);
		System.out.println(list);
	}

}
