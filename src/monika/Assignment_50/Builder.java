/*Assignment - 50 : 10th Oct'2021 [Comparable]
Write a method to sort builder object based on revenue;
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.
Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.
Expectation : while printing arrayList, it should print build names and revenue based on revenue ascending order.
 */
package monika.Assignment_50;

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

	@Override
	public int compareTo(Builder o) {
		// TODO Auto-generated method stub
		return this.revenue - o.revenue;
	}

	public String toString() {
		return name + " : " + revenue;
	}

}