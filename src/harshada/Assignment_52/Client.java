package harshada.Assignment_52;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1=new Employee (011, "harshada", 18,90000);
		Employee obj2=new Employee (012, "rasika", 12, 100000);
		Employee obj3=new Employee (013, "parthavi", 20,90000);
		Employee obj4=new Employee (014, "harshada", 18,50000);
		
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
