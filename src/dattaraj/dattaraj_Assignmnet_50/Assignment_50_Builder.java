
package dattaraj.dattaraj_Assignmnet_50;

public class Assignment_50_Builder implements Comparable<Assignment_50_Builder>{

	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;
	
	public Assignment_50_Builder(String name, int gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	@Override
	public int compareTo(Assignment_50_Builder builder) {
		return this.revenue - builder.revenue;
	}
	
	@Override
	public String toString() {
		return name + "-" + revenue;
	}
}