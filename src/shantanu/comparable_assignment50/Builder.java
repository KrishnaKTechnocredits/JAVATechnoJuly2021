package shantanu.comparable_assignment50;

public class Builder implements Comparable<Builder> {
	//name, gstNumber, totalCompletedProject, Revenue
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

	@Override
	public int compareTo(Builder o) {
		return this.revenue - o.revenue;
	}
	
	public String toString() {
		return name + ":" + revenue;
	}
}
