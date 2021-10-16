package shantanu.comparator_assignment51;

public class Builder {
	String name;
	int gstNumber;
	int totalCompletedProjects;
	int revenue;
	
	Builder(String name, int gstNumber, int totalCompletedProjects, int revenue){
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProjects = totalCompletedProjects;
		this.revenue = revenue;
	}
	
	public String toString() {
		return name + ":" + revenue;
	}
}
