package purshottamJoshi;

public class Assignment49_Builder {
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;
	
	public Assignment49_Builder(String name,String gstNumber,int totalCompletedProject,int revenue) {
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.revenue=revenue;
	}
	@Override
	public int hashCode() {
		return name.length();
	}

	@Override
	public boolean equals(Object obj) {
		Assignment49_Builder b = (Assignment49_Builder) obj;
		return this.name.equals(b.name) && this.gstNumber.equals(b.gstNumber) && this.revenue == b.revenue;
	}
}
