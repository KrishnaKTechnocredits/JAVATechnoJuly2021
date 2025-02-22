package suchita;
// Assignment 52

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment52 {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Selva", 3, 700);
		Employee emp2 = new Employee(2, "Srivalli", 3, 500);
		Employee emp3 = new Employee(3, "Prabhu", 6, 400);
		Employee emp4 = new Employee(4, "Veena", 2, 800);
		Employee emp5 = new Employee(5, "Reddy", 2, 900);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		Collections.sort(employeeList);
		System.out.println(employeeList);
	}

}