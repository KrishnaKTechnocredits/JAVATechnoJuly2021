package margi.Assignment_51;

/*[Comparator]
Write a method to sort builder object based on revenue (ascending) and totalCompletedProject;
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.
Exception : while sort the arrayList based on revene, it should print build information based
on revenue ascending order. while sort the arrayList based on totalCompletedProject, it should
print build information based decending order of totalCompletedProject*/

public class Builder{

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
	public String toString() {
		return name + " : " + revenue + " : " + totalCompletedProject;
	}
}
