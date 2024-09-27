package neha.assignment_49;
/*Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation. */

public class Builder {
	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;

	Builder(String name, int gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public boolean equals(Object obj) {
		Builder builder = (Builder) obj;
		return (this.name.equals(builder.name) && (this.gstNumber == builder.gstNumber)
				&& (this.totalCompletedProject == builder.totalCompletedProject) && (this.revenue == builder.revenue));
	}

	@Override
	public int hashCode() {
		int code = 0;
		char[] ch = this.name.toCharArray();
		for (char c : ch) {
			code += c;
		}
		code = code & 15;
		return code;
	}

	@Override
	public String toString() {
		return name + "-" + gstNumber + "-" + totalCompletedProject + "-" + revenue;
	}

}
