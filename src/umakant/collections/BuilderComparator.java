package umakant.collections;

public class BuilderComparator {
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;

	BuilderComparator(String name, String gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name + ":[Revenue:" + revenue + ",TotalCompletedProject:" + totalCompletedProject + "]";

	}

}
