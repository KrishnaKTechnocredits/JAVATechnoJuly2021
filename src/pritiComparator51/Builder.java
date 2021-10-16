package pritiComparator51;

public class Builder {
	String gstNumber;
	String buildName;
	int revenue;
	int totalCompletedproject;
	Builder(String gstNumber,String buildName, int revenue, int totalCompletedproject){
		this.gstNumber= gstNumber;
		this.buildName = buildName;
		this.revenue = revenue;
		this.totalCompletedproject = totalCompletedproject;
	}
	
	public String toString() {
		return this.buildName+"-"+this.gstNumber+"-"+this.revenue+"-"+this.totalCompletedproject;
	}
	

}
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