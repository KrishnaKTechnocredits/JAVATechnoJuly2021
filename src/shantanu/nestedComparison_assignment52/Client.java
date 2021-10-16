package shantanu.nestedComparison_assignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Employee employee1 = new Employee(100,"Virat",20000,9);
		Employee employee2 = new Employee(101,"Virat",50000,15);
		Employee employee3 = new Employee(103,"Virat",20000,12);
		Employee employee4 = new Employee(104,"Rohit",10000,6);
		Employee employee5 = new Employee(100,"Mahendra",40000,15);
		
		ArrayList<Employee> listOfEmployees = new ArrayList();
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);
		listOfEmployees.add(employee4);
		listOfEmployees.add(employee5);
		
		System.out.println("Before Sorting:");
		System.out.println(listOfEmployees);
		
		System.out.println("After Sorting:");
		Collections.sort(listOfEmployees);
		System.out.println(listOfEmployees);
	}
}
