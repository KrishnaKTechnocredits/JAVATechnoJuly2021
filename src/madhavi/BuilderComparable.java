package madhavi;

public class BuilderComparable implements Comparable<BuilderComparable> {

	String name, gstNumber;
	int totalCompletedProject, revenue;

	public BuilderComparable(String name, String gstNumbber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumbber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public int compareTo(BuilderComparable builder) {
		return this.revenue - builder.revenue;

	}

	@Override
	public String toString() {
		return name + " " + gstNumber + " " + totalCompletedProject + " " + revenue;
	}
}
