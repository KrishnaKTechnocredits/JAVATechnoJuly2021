package margi.Assignment_49;

/*[hashCode & Equals]
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

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

	@Override
	public int hashCode() {
		return name.length();
	}

	@Override
	public boolean equals(Object obj) {
		Builder b = (Builder) obj;
		return this.name.equals(b.name) && this.gstNumber.equals(b.gstNumber) && this.revenue == b.revenue;
	}

}
