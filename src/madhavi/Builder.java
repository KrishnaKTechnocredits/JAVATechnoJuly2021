package madhavi;

/*Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/
public class Builder {
	String name, gstNumber;
	int totalCompletedProject, revenue;

	public Builder(String name, String gstNumbber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumbber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public int hashCode() {
		int code = 0;
		char[] ch = this.name.toCharArray();
		for (int num : ch) {
			code += num;
		}
		code = code & 15;
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		Builder builder = (Builder) obj;
		return this.gstNumber.equals(builder.gstNumber) && this.name.equals(builder.name)
				&& this.revenue == builder.revenue;
	}

	@Override
	public String toString() {
		return name + " " + gstNumber + " " + totalCompletedProject + " " + revenue;
	}
}
