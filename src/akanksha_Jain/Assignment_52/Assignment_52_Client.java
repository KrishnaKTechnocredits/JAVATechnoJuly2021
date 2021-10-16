package akanksha_Jain.Assignment_52;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_52_Client {

	public static void main(String[] args) {
		ArrayList<Assignment_52_Employee> al = new ArrayList<Assignment_52_Employee>();
		Assignment_52_Employee emp1 = new Assignment_52_Employee(1, "Maulik", 10000, 1);
		Assignment_52_Employee emp2 = new Assignment_52_Employee(3, "Akansha", 800000, 8);
		Assignment_52_Employee emp3 = new Assignment_52_Employee(4, "Vivek", 150000, 4);
		Assignment_52_Employee emp4 = new Assignment_52_Employee(2, "Akansha", 50000, 2);
		Assignment_52_Employee emp5 = new Assignment_52_Employee(5, "Akansha", 50000, 3);
		
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		
		Collections.sort(al);
		System.out.println(al);
	}
}