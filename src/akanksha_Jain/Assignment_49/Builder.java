package akanksha_Jain.Assignment_49;

public class Builder implements Comparable<Builder>{
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
	public int compareTo(Builder builder) {
		return this.name.compareTo(builder.name);
	}
	
	@Override
	public String toString() {
		return name + "-" +  gstNumber + "-" + revenue;
	}
}
