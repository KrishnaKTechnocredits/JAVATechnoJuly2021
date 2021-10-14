package shantanu.hashCode_equals_assignment49;

public class Builder {
	//name, gstNumber, totalCompletedProject, Revenue
	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name, int gstNumber, int totalCompletedProject, int revenue){
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	public int hashCode() {
		return gstNumber;
	}
	
	public boolean equals(Object obj) {
		Builder builder = (Builder)obj;
		if(this.name.equals(builder.name) && this.gstNumber == builder.gstNumber && this.revenue == builder.revenue)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return name + ":" + gstNumber;
	}
}
