package tarangAssignment49;
/*Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

public class Builder {

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
	
	public int hashCode() {
		int code = 0;
		char[] arr = this.name.toCharArray();
		for (char ch : arr) {
			code = +ch;
		}
		return code;
	}

	public boolean equals(Object obj) {
		Builder b1 = (Builder) obj;
		return (this.name.equals(b1.name));
	}

}
