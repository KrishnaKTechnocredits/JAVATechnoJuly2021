package margi.Assignment_50;

/*[Comparable]
Write a method to sort builder object based on revenue;
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.
Exception : while printing arrayList, it should print build names
and revune based on revenue ascending order.*/

public class Builder implements Comparable<Builder>{

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
		return this.revenue-b.revenue;
	}
	
	@Override
	public String toString() {
		return name + " : " + revenue;
	}
}
