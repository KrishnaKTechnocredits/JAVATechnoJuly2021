/*Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (acending) and totalCompletedProject;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while sort the arrayList based on revene, it should print build information based on revenue ascending order. 
while sort the arrayList based on totalCompletedProject, it should print build information based decending order of totalCompletedProject.
*/
package amol_Vyas.Assignment_51;

import java.util.Comparator;

public class Builder {

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
		return name + " " + revenue+ " "+totalCompletedProject;
	}

}
