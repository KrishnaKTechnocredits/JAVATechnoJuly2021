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

Exception : while printing arrayList, it should print build names and revenue based on revenue ascending order.*/

package shraddha.Assignment50;

public class CallBuilder implements Comparable<CallBuilder>{
	String name;
	String gstNumber;
	int totalCompleteProject;
	int revenue;

	public CallBuilder(String name, String gstNumber, int totalCompleteProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompleteProject = totalCompleteProject;
		this.revenue = revenue;
	}

	public String toString() {
		return name + " : " + revenue;
	}

	public int compareTo(CallBuilder cb) {

		return this.revenue - cb.revenue;
	}
}
