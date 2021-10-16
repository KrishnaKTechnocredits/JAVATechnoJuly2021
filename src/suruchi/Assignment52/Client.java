package suruchi.Assignment52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee(5, "A", 200, 2);
		Employee emp2 = new Employee(6, "A", 100, 2);
		Employee emp3 = new Employee(3, "C", 300, 4);
		Employee emp4 = new Employee(2, "B", 50, 1);
		Employee emp5 = new Employee(1, "A", 600, 2);

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