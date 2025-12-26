package devendra_3;

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
		return this.name.equals(b.name) && this.gstNumber.equals(b.gstNumber) && this.totalCompletedProjects == b.totalCompletedProjects && this.revenue == b.revenue;
	}
}