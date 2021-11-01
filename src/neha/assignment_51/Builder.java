package neha.assignment_51;

import java.util.Comparator;

/*Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (ascending) and totalCompletedProject;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Expected : while sort the arrayList based on revenue, 
it should print build information based on revenue ascending order. 
while sort the arrayList based on totalCompletedProject, 
it should print build information based descending order of totalCompletedProject.*/

public class Builder {
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
		return name + "-" + revenue + "-" + totalCompletedProject + "-" + gstNumber;
	}
}
