package ritabrata2.Assignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Techno", 93825, 9);
		Employee e2 = new Employee(5, "Ritabrata", 50066, 7);
		Employee e3 = new Employee(21, "Maulik", 70312, 5);
		Employee e4 = new Employee(7, "krishna", 60970, 6);
		Employee e5 = new Employee(12, "Harsh", 12345, 2);

		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list);
		System.out.println("Sorted list : " + list);

	}

}
