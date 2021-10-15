package vivek.Assignment49;

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
		return (this.name.equals(b1.name) && this.gstNumber.equals(b1.gstNumber) && this.revenue == b1.revenue);
	}
}
