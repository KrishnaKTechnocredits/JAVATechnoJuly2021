
package santosh_Assignment52;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee(11, "Santosh", 2000, 2);
		Employee emp2 = new Employee(22, "Santosh", 1850, 5);
		Employee emp3 = new Employee(33, "Santosh", 2550, 3);
		Employee emp4 = new Employee(44, "Avinash", 3500, 7);
		Employee emp5 = new Employee(55, "Shri", 3000, 6);

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
