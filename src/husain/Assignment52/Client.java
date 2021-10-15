package husain.Assignment52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(10, "Mesut", 10000, 5);
		Employee emp2 = new Employee(20, "Marcel", 12000, 6);
		Employee emp3 = new Employee(30, "Mesut", 8000, 5);
		Employee emp4 = new Employee(40, "Mesut", 10000, 6);
		Employee emp5 = new Employee(50, "Benedict", 15000, 7);
		Employee emp6 = new Employee(60, "Arsene", 20000, 15);

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		Collections.sort(list);
		System.out.println(list);
	}

}
