/*Assignment - 51 : 10th Oct'2021 [Comparator]
Write a method to sort builder object based on revenue (acending) and totalCompletedProject;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

package tarangAssignment51;

import java.util.Comparator;

public class Builder implements Comparator<Builder> {
	
	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name,int gstNum,int totalCompletedProject,int revenue){
		this.name=name;
		this.gstNumber=gstNum;
		this.totalCompletedProject=totalCompletedProject;
		this.revenue=revenue;
	}
	
	@Override
	public int compare(Builder b1,Builder b2) {
		return b1.revenue-b2.revenue;
	}
	
	@Override
	public String toString() {
		return this.name+ "->" +this.revenue;
		
	}
}
