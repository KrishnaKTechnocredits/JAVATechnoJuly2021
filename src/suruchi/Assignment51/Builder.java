/*Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

package suruchi.Assignment51;

public class Builder {

	String name, gstNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name, String gstNumber, int totalCompletedProject, int revenue){
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	public String toString() {
		return name + " : " + revenue + " : "+ totalCompletedProject;
	}
}