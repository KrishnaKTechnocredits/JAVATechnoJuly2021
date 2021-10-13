/*Assignment - 50 : 10th Oct'2021 [Comparable]
Write a method to sort builder object based on revenue;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

package elizabeth_Assignment_50;

public class Builder implements Comparable<Object> {
	
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
	public String toString() {
		return name+ "->" +revenue;
		
	}
	
	@Override
	public int compareTo(Object obj) {
		Builder b1=(Builder)obj;
		return this.revenue-b1.revenue;
	}

}
