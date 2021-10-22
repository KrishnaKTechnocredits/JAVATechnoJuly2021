package amol_Pawar.Assignment_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Employee employee=new Employee(1,"Amol",200,3);
		
		Employee employee1=new Employee(2,"Rakesh",20,3);

		Employee employee2=new Employee(2,"Amol",3000,2);

		Employee employee3=new Employee(4,"Sanket",20,5);
		
		List<Employee> l=new ArrayList<>();
		l.add(employee);
		l.add(employee1);
		l.add(employee2);
		l.add(employee3);
		Collections.sort(l);
		System.out.println(l);
		

	}

}
