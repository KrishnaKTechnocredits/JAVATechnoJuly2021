package gauravk.Assignment_52;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.

-----------------------------------------------------------------
 */
public class Client {
	public static void main(String[] args) {
		Employee e1 = new Employee("a1","Jadav",30000, 7);
		Employee e2 = new Employee("b1","Madhav",37000, 4);
		Employee e3 = new Employee("b2","Sangita",20000, 10);
		Employee e4 = new Employee("a3","Madhvi",27000, 5);
		Employee e5 = new Employee("a4","Vivek",30000, 3);
		Employee e6 = new Employee("b3","Jadav",39000, 7);
		Employee e7 = new Employee("b4","Atul",35000, 6);
		Employee e8 = new Employee("b5","Vivek",32000, 3);
		Employee e9 = new Employee("b6","Jadav",31000, 9);
		Employee e10 = new Employee("a5","Sangita",24000, 8);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		employeeList.add(e7);
		employeeList.add(e8);
		employeeList.add(e9);
		employeeList.add(e10);
		System.out.println(employeeList);
		Collections.sort(employeeList);
		for(Employee x: employeeList) {
			System.out.println(x);
		}
	}
}