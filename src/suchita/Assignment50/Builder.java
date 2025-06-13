package suchita.Assignment50;
// Assignment 50

public class Builder implements Comparable<Builder> {

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
	public int compareTo(Builder o) {
		
		return this.revenue - o.revenue;
	}

	public String toString() {
		return name + " : " + revenue;
	}

}