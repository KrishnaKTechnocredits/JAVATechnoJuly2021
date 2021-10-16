package shalakaAssignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Ass52_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee b1 = new Employee("shalaka", 123, 50000, 1);
		Employee b2 = new Employee("shashank", 456, 20000, 2);
		Employee b3 = new Employee("shalaka", 789, 50000, 1);
		Employee b4 = new Employee("sayli", 222, 40000, 7);
		Employee b5 = new Employee("shalaka", 111, 70000, 6);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		Collections.sort(list);
		System.out.println(list);
	}

}
