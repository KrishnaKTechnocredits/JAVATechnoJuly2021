package devendra_Assignments.assignment50;
/*Assignment - 50*/
public class Builder implements Comparable<Builder> {
	String name;
	String gstNumber;
	int totalCompleteProject;
	int revenue;

	public Builder(String name, String gstNumber, int totalCompleteProject,int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompleteProject = totalCompleteProject;
		this.revenue = revenue;
	}
	public String toString() {
		return name+" : "+revenue;
	}
	
	@Override
	public int compareTo(Builder b1) {
		return this.revenue - b1.revenue;
	}
}