package somnath_Assignment_49;

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
	int totalCompletedProjects;
	int revenue;

	public Builder(String name, String gstNumber, int totalCompletedProjects, int revenue) {
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
		Builder b1 = (Builder) obj;
		return this.name.equals(b1.name) && this.gstNumber.equals(b1.gstNumber)
				&& this.totalCompletedProjects == b1.totalCompletedProjects && this.revenue == b1.revenue;
	}
}

