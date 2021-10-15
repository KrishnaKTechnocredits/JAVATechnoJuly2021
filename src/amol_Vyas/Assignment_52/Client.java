package amol_Vyas.Assignment_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(5, 200, 2, "A");
		Employee emp2 = new Employee(6, 100, 2, "A");
		Employee emp3 = new Employee(3, 300, 4, "C");
		Employee emp4 = new Employee(2, 50, 1, "B");
		Employee emp5 = new Employee(1, 600, 2, "A");
		
		List<Employee> list = new ArrayList();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		Collections.sort(list);
		System.out.println(list);
	}

}
