package parthav.parthavD_Assignment50;

public class Builder implements Comparable<Builder> {
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name, String gstNumber, int totalCompletedProject, int revenue){
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public int compareTo(Builder obj1) {
		if(this.revenue > obj1.revenue)
			return 1;
		else if(this.revenue == obj1.revenue)
			return 0;
		return -1;
		
	}
	
	@Override
	public String toString() {
		return (this.name + " : " + this.revenue);
	}
	
}
