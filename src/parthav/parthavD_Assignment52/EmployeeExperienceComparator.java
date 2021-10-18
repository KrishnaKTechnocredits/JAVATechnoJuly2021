package parthav.parthavD_Assignment52;

import java.util.Comparator;

public class EmployeeExperienceComparator implements Comparator<Employee> {
	
	
	public int compare(Employee emp1, Employee emp2) {
		return emp1.yearsOfExperience - emp2.yearsOfExperience;
	}
}
