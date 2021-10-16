package margi.Assignment_52;

/*[Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years
of exp, if years of exp is same, further comparision should be based on salary.*/

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Techno", 86000, 9);
		Employee e2 = new Employee(5, "Moana", 46000, 2);
		Employee e3 = new Employee(21, "Anna", 45000, 3);
		Employee e4 = new Employee(7, "Elsa", 99000, 9);
		Employee e5 = new Employee(12, "Moana", 35000, 2);

		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
	}
}
