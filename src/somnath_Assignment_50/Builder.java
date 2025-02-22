package somnath_Assignment_50;

public class Builder implements Comparable<Builder> {
	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;

	Builder(String name,int gstNumber,int totalCompletedProject,int revenue){
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.revenue=revenue;
	}
	@Override
    public int compareTo(Builder b){
	    return this.revenue-b.revenue;
	}
	@Override
	public String toString() {
		return name+" : "+revenue;
	}
}
 

