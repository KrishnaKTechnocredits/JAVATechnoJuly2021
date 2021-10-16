/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
 */
package monika.Assignment_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "A", 100, 5);
		Employee emp2 = new Employee(2, "B", 180, 3);
		Employee emp3 = new Employee(3, "D", 90, 1);
		Employee emp4 = new Employee(4, "E", 200, 7);
		Employee emp5 = new Employee(5, "C", 30, 4);

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		Collections.sort(list);
		System.out.println(list);
	}

}

