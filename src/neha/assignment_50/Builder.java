package neha.assignment_50;

/*Assignment - 50 : 10th Oct'2021 [Comparable]
Write a method to sort builder object based on revenue;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Exception : while printing arrayList, it should print build names and revenue based on revenue ascending order.*/
public class Builder implements Comparable<Builder> {
	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;

	Builder(String name, int gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name + "-" + revenue;
	}
	@Override
	public int compareTo(Builder builder) {
		return this.revenue - builder.revenue;
	}
}
