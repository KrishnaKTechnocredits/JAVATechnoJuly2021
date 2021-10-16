package vivek.Assignment50;

public class Builder implements Comparable<Builder> {

	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;

	Builder(String name, String gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	public int compareTo(Builder b) {
		return this.revenue - b.revenue;
	}

	public String toString() {
		return name + "-" + revenue;
	}
}
