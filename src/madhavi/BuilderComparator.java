package madhavi;

public class BuilderComparator {
	String name, gstNumber;
	int totalCompletedProject, revenue;

	public BuilderComparator(String name, String gstNumbber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumbber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name +  " " + revenue + " "  + totalCompletedProject ;
	}
}
