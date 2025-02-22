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

Exception : while sort the arrayList based on revene, it should print build information based on revenue ascending order. while sort the arrayList based on totalCompletedProject, it should print build information based decending order of totalCompletedProject.
*/


package ritabrata2.Assignment51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Builder {
	String builderName;
	int gstNo;
	int revenue;
	int totalCompletedProject;

	Builder(String builderName, int gstNo, int revenue, int totalCompleted) {
		this.builderName = builderName;
		this.gstNo = gstNo;
		this.revenue = revenue;
		this.totalCompletedProject = totalCompleted;
	}

	public String toString() {
		return builderName + "-" + revenue + "-" + totalCompletedProject;
	}
	
	
	

}

