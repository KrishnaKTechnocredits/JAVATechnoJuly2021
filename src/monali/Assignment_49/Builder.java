package monali.Assignment_49;

public class Builder {

	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;

	public Builder(String name, int gstNumber, int totalCompletedProject, int revenue) {

		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name;

	}

	@Override
	public int hashCode() {
		char arr[] = name.toCharArray();
		int hcode = 0;
		for (char ch : arr) {
			hcode += ch;
		}
		return hcode;
	}

	@Override
	public boolean equals(Object obj) {
		Builder bdr = (Builder) obj;
		return (this.name == bdr.name && this.gstNumber == bdr.gstNumber && this.revenue == bdr.revenue);

	}

}
