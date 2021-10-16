package umakant.collections;

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
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		char[] charArray = name.toCharArray();
		int ascciiValueSum = 0;
		for (char ch : charArray)
			ascciiValueSum += ch;
		return ascciiValueSum;
	}

	@Override
	public boolean equals(Object obj) {
		Builder builder = (Builder) obj;
		return (this.name == builder.name) && (this.gstNumber == builder.gstNumber)
				&& (this.revenue == builder.revenue);
	}

}
