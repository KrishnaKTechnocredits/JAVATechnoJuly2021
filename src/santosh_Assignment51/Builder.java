
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

package santosh_Assignment51;
import java.util.Comparator;
public class Builder implements Comparator<Builder>{
	String name="";
	int gstNumber=0;
	int totalCompletedProject=0;
	int Revenue=0;

	Builder(String name,int gst,int total,int revenue){
		this.name=name;
		this.gstNumber=gst;
		this.totalCompletedProject=total;
		this.Revenue=revenue;
	}
	@Override
	public String toString() {
		return this.name+ " : "+this.Revenue + " : "+this.totalCompletedProject;
	}

	@Override
	public int compare(Builder b1,Builder b2) {
		return b1.Revenue-b2.Revenue;
	}


}
