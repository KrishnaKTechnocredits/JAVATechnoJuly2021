package pritiComparable_50;

public class Builder implements Comparable<Builder>{
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
	@Override
	public int compareTo(Builder b1) {
		return this.revenue-b1.revenue;
	}
	@Override
	public String toString() {
		return this.buildName+"-"+this.revenue;
	}
}
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

Exception : while printing arrayList, it should print build names and revune based on revenue ascending order.
*/