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

Exception : while printing arrayList, it should print build names and revune based on revenue ascending order.*/
package indu.Assignment_50;

public class Builder_50 implements Comparable<Builder_50>{// we can avoid writing class name if we want
	String name;
	String gstNumber;
	int totalCompleteProjects;
	int revenue;

	Builder_50(String name,String gstNumber,int totalCompleteProjects,int revenue)
	{
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompleteProjects = totalCompleteProjects;
		this.revenue= revenue;
	}

	@Override
	public int compareTo(Builder_50 b1)	
	{
		//public int compareTo(Object obj){
		//Builder_50 b1 = (Builder_50)obj;
		return this.revenue-b1.revenue ;
	}
	
	public String toString()
	{
		return name+ " : "+ revenue;
	}
}
