package devendra_Assignments.assignment51;
/*Assignment - 51*/
public class CallBuilder {
	String name;
	String gstNumber;
	int totalCompleteProject;
	int revenue;

	public CallBuilder(String name, String gstNumber, int totalCompleteProject,int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompleteProject = totalCompleteProject;
		this.revenue = revenue;
	}
	public String toString() {
		return name+" : "+revenue+" : "+totalCompleteProject;
	}
}
