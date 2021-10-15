package nishi.Assignment51;

public class Builder{
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;
	public Builder(String name, String gstNumber, int totalCompletedProject, int revenue) {

		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	@Override
	public String toString()
	{
		return this.name+"->"+this.revenue+"->"+this.totalCompletedProject;
	}

	
	
	
}
