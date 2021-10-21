package suchita.Assignment51;
// Assignment 51

//Builder class

public class Builder {

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

	public String toString() {
		return name + " : " + revenue;
	}

}