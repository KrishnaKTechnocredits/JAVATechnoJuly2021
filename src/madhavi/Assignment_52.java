package madhavi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_52 {
	public static void main(String[] args) {
		Employee_Collection emp1 = new Employee_Collection(1, "Sai", 20000, 7);
		Employee_Collection emp2 = new Employee_Collection(6, "TOM", 1000, 2);
		Employee_Collection emp3 = new Employee_Collection(3, "JAI", 3000, 3);
		Employee_Collection emp4 = new Employee_Collection(4, "JOE", 500, 1);
		Employee_Collection emp5 = new Employee_Collection(8, "Serg", 600, 1);

		List<Employee_Collection> emplist = new ArrayList<Employee_Collection>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		Collections.sort(emplist);
		System.out.println(emplist);

	}

}
