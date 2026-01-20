/*Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

package suruchi.Assignment50;

public class Builder implements Comparable<Builder> {

	String name, gstNumbber;
	int totalCompletedProject, revenue;

	public Builder(String name, String gstNumbber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumbber = gstNumbber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name + " : " + revenue;
	}

	@Override
	public int compareTo(Builder builder) {
		return this.revenue - builder.revenue;
	}
}