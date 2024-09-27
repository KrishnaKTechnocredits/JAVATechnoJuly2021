package parthav.parthavD_Assignment52;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.name.compareTo(emp2.name);
	}

}
