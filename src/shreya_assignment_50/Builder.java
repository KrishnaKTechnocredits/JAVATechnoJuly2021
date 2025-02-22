package shreya_assignment_50;

public class Builder implements Comparable<Builder> {
	String name;
	int gstNumber;
	int totalCompletedProject, revenue;

	public Builder(String name, int i, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = i;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	@Override
	public String toString() {
		return name + " " + revenue;
	}

	@Override
	public int compareTo(Builder builder) {
		// TODO Auto-generated method stub
		return this.revenue-builder.revenue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
