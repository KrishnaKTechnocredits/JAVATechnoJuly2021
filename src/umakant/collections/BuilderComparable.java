package umakant.collections;

public class BuilderComparable implements Comparable<BuilderComparable> {

	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;

	BuilderComparable(String name, String gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name + ":" + revenue;

	}

	@Override
	public int compareTo(BuilderComparable builder) {
		return this.revenue - builder.revenue;
	}

}
