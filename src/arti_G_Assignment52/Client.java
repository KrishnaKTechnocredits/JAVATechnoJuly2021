package arti_G_Assignment52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(300, "Arti", 10000, 4);
		Employee emp2 = new Employee(250, "Akansha", 20000, 5);
		Employee emp3 = new Employee(400, "Nidhi", 15000, 8);
		Employee emp4 = new Employee(500, "Varun", 180000, 9);
		Employee emp5 = new Employee(800, "Nishi", 130000, 3);
		Employee emp6 = new Employee(350, "Arti", 10000, 8);
		
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
//Output >[Name : Akansha Years of Exp : 5 Salary : 20000, Name : Arti Years of Exp : 4 Salary : 10000, Name : Arti Years of Exp : 8 Salary : 10000, Name : Nidhi Years of Exp : 8 Salary : 15000, Name : Nishi Years of Exp : 3 Salary : 130000, Name : Varun Years of Exp : 9 Salary : 180000]
