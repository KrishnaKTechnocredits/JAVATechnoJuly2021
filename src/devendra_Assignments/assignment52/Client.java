package devendra_Assignments.assignment52;
/*Assignment - 52
10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
	public static void main(String[] a) {
		Employee e1=new Employee(1,"Swati",2000,2);
		Employee e2=new Employee(2,"Harsh",1000,1);
		Employee e3=new Employee(3,"Maulik",5000,5);
		Employee e4=new Employee(4,"Swati",3000,2);

		List<Employee> list1=new ArrayList();
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		Collections.sort(list1);
		System.out.println(list1);
		}
}