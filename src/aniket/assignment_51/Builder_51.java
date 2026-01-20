package aniket.assignment_51;

import java.util.Comparator;

public class Builder_51 {
	
	String name;
	String gstNumber;
	public int totalCompleteProjects;
	public int revenue;

	Builder_51(String name,String gstNumber,int totalCompleteProjects,int revenue)
	{
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompleteProjects = totalCompleteProjects;
		this.revenue= revenue;
	}
	
	public String toString() {
		return name + "-" + revenue + "-" + totalCompleteProjects;
	}
}
