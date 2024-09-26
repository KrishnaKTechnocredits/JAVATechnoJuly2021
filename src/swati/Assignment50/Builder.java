package swati.Assignment50;

public class Builder implements Comparable<Builder>{
	String name,gstNumber;
	int totalCompletedProject;
	int revenue;
	
	public Builder(String name,String gstNumber,int totalCompletedProject,int revenue ){
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.revenue=revenue;		
	}
	
	@Override
	public int compareTo(Builder b) {
		return this.revenue-b.revenue;
	}
	
	@Override
	public String toString() {
		
		return name+"-"+revenue;
	}
}

