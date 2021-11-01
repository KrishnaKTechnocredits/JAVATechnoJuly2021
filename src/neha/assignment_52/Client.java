package neha.assignment_52;

/*Assignment - 52 : 10th Oct'2021 [Nested Comparison - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next Comparison should be years of exp, 
if years of exp is same, further Comparison should be based on salary.*/
import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Parth", 1000, 2);
		Employee emp2 = new Employee(102, "Aarchi", 5000, 3);
		Employee emp3 = new Employee(103, "Ovi", 5000, 5);
		Employee emp4 = new Employee(104, "Sara", 6000, 2);
		Employee emp5 = new Employee(106, "Avani", 10000, 7);
		Employee emp6 = new Employee(105, "Avani", 15000, 6);
		Employee emp7 = new Employee(107, "Avani", 25000, 6);

		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		listOfEmployees.add(emp5);
		listOfEmployees.add(emp6);
		listOfEmployees.add(emp7);
		Collections.sort(listOfEmployees);
		System.out.println(listOfEmployees);
	}
}
