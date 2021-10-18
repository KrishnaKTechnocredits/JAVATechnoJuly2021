package parthav.parthavD_Assignment52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Jack Ryan", 5000, 16);
		Employee emp2 = new Employee(2, "Emp Jac", 4000, 10);
		Employee emp3 = new Employee(3, "Simone Jse", 6000, 20);
		Employee emp4 = new Employee(4, "Elsa Emmy", 10000, 5);
		Employee emp5 = new Employee(5, "Jack Ryan", 5000, 15);
		Employee emp6 = new Employee(6, "Jack Tse", 8000, 21);
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		List<Employee> list1 = new ArrayList<>(list);
		System.out.println("Original list without any sorting");
		System.out.println(list);
		System.out.println("List with Comparable sorting");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("List with Comparator sorting based on Name");
		Collections.sort(list1, new EmployeeNameComparator());
		System.out.println(list1);
		System.out.println("List with Comparator sorting based on Years of Experience");
		Collections.sort(list1, new EmployeeExperienceComparator());
		System.out.println(list1);
		System.out.println("List with Comparator sorting based on Salary");
		Collections.sort(list1, new EmployeeSalaryComparator());
		System.out.println(list1);

	}

}
