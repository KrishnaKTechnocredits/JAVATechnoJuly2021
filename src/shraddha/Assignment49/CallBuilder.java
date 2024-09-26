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

package shraddha.Assignment49;

public class CallBuilder {
	String name;
	String gstNumber;
	int totalCompletedProjects;
	int revenue;

	public CallBuilder(String name, String gstNumber, int totalCompletedProjects, int revenue) {
		super();
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProjects = totalCompletedProjects;
		this.revenue = revenue;
	}

	@Override
	public int hashCode() {
		return name.length();
	}

	@Override
	public boolean equals(Object obj) {
		CallBuilder b = (CallBuilder) obj;
		return this.name.equals(b.name) && this.gstNumber.equals(b.gstNumber)
				&& this.totalCompletedProjects == b.totalCompletedProjects && this.revenue == b.revenue;
	}
}
